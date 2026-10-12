import { render } from '@acmehealth/shared-utils-jest'

import { Flex } from './flex'

describe('Flex', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Flex />)
    expect(baseElement).toBeTruthy()
  })
})
