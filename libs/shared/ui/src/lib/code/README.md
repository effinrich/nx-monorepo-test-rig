---
id: code
title: Code
category: 'data-display'
package: '@acmehealth/ui'
description:
  Code is a component used to display inline code. It is composed from the Box
  component with a font family of `mono` for displaying code.
---

# Code

## Import

```js
import { Code } from '@acmehealth/ui'
```

## Usage

```jsx
<Code>Hello world</Code>
```

### Colors

You can change the color scheme of the component by passing the `colorScheme`
prop.

```jsx
<Stack direction="row">
  <Code children="console.log(welcome)" />
  <Code colorScheme="red" children="var acme = 'awesome!'" />
  <Code colorScheme="yellow" children="npm install acme" />
</Stack>
```
