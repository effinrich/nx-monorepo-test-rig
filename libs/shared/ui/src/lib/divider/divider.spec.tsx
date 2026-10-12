import { render } from '@acmehealth/shared-utils-jest'

import { Divider } from './divider'

describe('Divider', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Divider />)
    expect(baseElement).toBeTruthy()
  })
})
