# Contributing

## Issues

Please report bugs or feature requests by [creating GitHub issues].

[creating GitHub issues]: https://github.com/aas-core-works/aas-core3.0-java/issues/new/choose

## In Code

If you want to contribute in code, pull requests are welcome!

Please do [create a new issue] before you dive into coding.
It can well be that we already started working on the feature, or that there are upstream or downstream complexities involved which you might not be aware of.

[create a new issue]: https://github.com/aas-core-works/aas-core3.0-java/issues/new/choose

### SDK Code Generation

The biggest part of the code has been automatically generated by [aas-core-codegen].
It probably makes most sense to change the generator rather than add new functionality.
However, this needs to be decided on a case-by-case basis.

[aas-core-codegen]: https://github.com/aas-core-works/aas-core-codegen

### Semantic Patching for `dk.brics.automaton`

The regular expression engine in the standard Java library runs into stack overflow on some of the regular expressions required by the meta-model.
We therefore had to resort to the external library `dk.brics.automaton` for some of the regular expressions.

Once the code is generated by `aas-core-codegen` (see above), you have to semantically patch it to use `dk.brics.automaton`.

Please see [dev_scripts/semantic-patching/README.md](dev_scripts/semantic-patching/README.md) for more information.

### Test Code Generation

The code of the unit tests has been automatically generated using the Python scripts in the `dev_scripts/` directory.

To re-generate the test code, first create a virtual environment in `dev_scripts/`:

```
python -m venv venv
```

Activate the virtual environment (in Windows):

```
venv\Scripts\activate
```

or in Linux:
```
source venv/bin/activate
```

Then install the dependencies:

```
pip3 install -e .
```

Now you can run the generation scripts:

```
python testgen/generate_all.py
```

### Test Data

The test data is automatically generated by [aas-core3.0-testgen], and copied to this repository on every change.

[aas-core3.0-testgen]: https://github.com/aas-core-works/aas-core3.0-testgen

### Build

TODO

### Pre-commit Checks

TODO

## Pull Requests

**Feature branches**.
We develop using the feature branches, see [this section of the Git book].

[this section of the Git book]: https://git-scm.com/book/en/v2/Git-Branching-Branching-Workflows 

If you are a member of the development team, create a feature branch directly within the repository.

Otherwise, if you are a non-member contributor, fork the repository and create the feature branch in your forked repository. See [this GitHub tuturial] for more guidance. 

[this GitHub tutorial]: https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request-from-a-fork

**Branch Prefix**.
Please prefix the branch with your Github user name (*e.g.,* `mristin/Add-some-feature`).

**Continuous Integration**. 
GitHub will run the continuous integration (CI) automatically through GitHub actions.
The CI includes building the solution, running the test, inspecting the code *etc.*

### Commit Messages

The commit messages follow the guidelines from https://chris.beams.io/posts/git-commit:

* Separate subject from body with a blank line,
* Limit the subject line to 50 characters,
* Capitalize the subject line,
* Do not end the subject line with a period,
* Use the imperative mood in the subject line,
* Wrap the body at 72 characters, and
* Use the body to explain *what* and *why* (instead of *how*).