import { mocks, render } from '@acmehealth/shared-utils-jest'

import { MyRequests } from './my-requests'

describe('MyRequests', () => {
  mocks.matchMedia('any', false)
  it('should render successfully', () => {
    const { baseElement } = render(<MyRequests />)
    expect(baseElement).toBeTruthy()
  })
})
