import { render } from '@acmehealth/shared-utils-jest'

import { Box } from './box'

describe('Box', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Box />)
    expect(baseElement).toBeTruthy()
  })
})
