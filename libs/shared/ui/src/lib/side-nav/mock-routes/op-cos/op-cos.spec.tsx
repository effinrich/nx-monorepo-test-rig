import { mocks, render } from '@acmehealth/shared-utils-jest'

import OpCos from './op-cos'

describe('OpCos', () => {
  mocks.matchMedia('any', false)
  it('should render successfully', () => {
    const { baseElement } = render(<OpCos />)
    expect(baseElement).toBeTruthy()
  })
})
