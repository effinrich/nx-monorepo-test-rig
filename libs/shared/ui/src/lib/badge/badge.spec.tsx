import { render } from '@acmehealth/shared-utils-jest'

import { Badge } from './badge'

describe('Badge', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Badge />)
    expect(baseElement).toBeTruthy()
  })
})
