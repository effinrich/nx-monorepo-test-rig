import { mocks, render } from '@acmehealth/shared-utils-jest'

import IPMarketplace from './ip-marketplace'

describe('IPMarketplace', () => {
  mocks.matchMedia('any', false)
  it('should render successfully', () => {
    const { baseElement } = render(<IPMarketplace />)
    expect(baseElement).toBeTruthy()
  })
})
