import { render } from '@acmehealth/shared-utils-jest'

import { Text } from './text'

describe('Center', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Text />)
    expect(baseElement).toBeTruthy()
  })
})
