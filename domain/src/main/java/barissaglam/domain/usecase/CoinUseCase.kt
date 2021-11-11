package barissaglam.domain.usecase

import barissaglam.core.data.Resource
import barissaglam.core.domain.BaseUseCase
import barissaglam.domain.model.CoinsData
import barissaglam.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CoinUseCase @Inject constructor(
    private val repository: CoinRepository
) : BaseUseCase<Unit, CoinsData>() {

    override fun execute(parameters: Unit): Flow<Resource<CoinsData>> {
        return repository.getCoins()
    }
}
