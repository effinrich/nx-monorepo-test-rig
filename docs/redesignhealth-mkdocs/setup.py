from setuptools import setup

setup(
    name='acmehealth-mkdocs',
    version='0.0.2',
    install_requires=[
        'requests',
        'bs4'
    ],
    entry_points={
        'mkdocs.plugins': [
          'acmehealth-mkdocs = LambdaFunctionUrlFetcher:LambdaFunctionUrlFetcher'
        ]
    }
)
