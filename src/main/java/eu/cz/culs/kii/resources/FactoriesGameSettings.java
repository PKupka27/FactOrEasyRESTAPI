/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.cz.culs.kii.resources;

/**
 *
 * @author jpavlicek

@Entity
@XmlRootElement
public class FactoriesGameSettings implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "FACTORIESGAME", referencedColumnName = "factoriesGameId")
    @OneToOne(optional = false)
    private FactoriesGame factoriesGameId;
    private String gameType;
    private int account;
    private int rawLowMaterialAvailable;
    private int rawUpMaterialAvailable;
    private int rawLowMaterialMinimumCost;
    private int rawUpMaterialMinimumCost; 
    private int potentialLowMarketForFinishedInventory;
    private int potentialUoMarketForFinishedInventory;
    private int maxLowMarketValueForFinishedInvetory;
    private int maxUpMarketValueForFinishedInvetory;
    private int numberOfPlayers;

    @Column(name = "material_store_costs")
    private int materialStoreCosts;

    @Column(name = "products_store_costs")
    private int productsStoreCosts;

    @Column(name = "standard_factory_fixed_cost")
    private int standardFactoryFixedCost;

    @Column(name = "automatized_factory_construction_costs")
    private int automatizedFactoryConstructionCosts;

    @Column(name = "material_store")
    private int materialStore;

    @Column(name = "product_in_store")
    private int productInStore;

    @Column(name = "standard_development_cost")
    private int standardDevelopmentCost;

    @Column(name = "automatized_development_costs")
    private int automatizedDevelopmentCosts;

    @Column(name = "standard_factory_number")
    private int standardFactoryNumber;

    @Column(name = "automatized_factory_number")
    private int automatizedFactoryNumber;

    @Column(name = "initial_number_of_games_per_player")
    private int initialNumberOfGamesPerPlayer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getRawLowMaterialAvailable() {
        return rawLowMaterialAvailable;
    }

    public void setRawLowMaterialAvailable(int rawLowMaterialAvailable) {
        this.rawLowMaterialAvailable = rawLowMaterialAvailable;
    }

    public int getRawUpMaterialAvailable() {
        return rawUpMaterialAvailable;
    }

    public void setRawUpMaterialAvailable(int rawUpMaterialAvailable) {
        this.rawUpMaterialAvailable = rawUpMaterialAvailable;
    }

    public int getRawLowMaterialMinimumCost() {
        return rawLowMaterialMinimumCost;
    }

    public void setRawLowMaterialMinimumCost(int rawLowMaterialMinimumCost) {
        this.rawLowMaterialMinimumCost = rawLowMaterialMinimumCost;
    }

    public int getRawUpMaterialMinimumCost() {
        return rawUpMaterialMinimumCost;
    }

    public void setRawUpMaterialMinimumCost(int rawUpMaterialMinimumCost) {
        this.rawUpMaterialMinimumCost = rawUpMaterialMinimumCost;
    }

    public int getPotentialLowMarketForFinishedInventory() {
        return potentialLowMarketForFinishedInventory;
    }

    public void setPotentialLowMarketForFinishedInventory(int potentialLowMarketForFinishedInventory) {
        this.potentialLowMarketForFinishedInventory = potentialLowMarketForFinishedInventory;
    }

    public int getPotentialUoMarketForFinishedInventory() {
        return potentialUoMarketForFinishedInventory;
    }

    public void setPotentialUoMarketForFinishedInventory(int potentialUoMarketForFinishedInventory) {
        this.potentialUoMarketForFinishedInventory = potentialUoMarketForFinishedInventory;
    }

    public int getMaxLowMarketValueForFinishedInvetory() {
        return maxLowMarketValueForFinishedInvetory;
    }

    public void setMaxLowMarketValueForFinishedInvetory(int maxLowMarketValueForFinishedInvetory) {
        this.maxLowMarketValueForFinishedInvetory = maxLowMarketValueForFinishedInvetory;
    }

    public int getMaxUpMarketValueForFinishedInvetory() {
        return maxUpMarketValueForFinishedInvetory;
    }

    public void setMaxUpMarketValueForFinishedInvetory(int maxUpMarketValueForFinishedInvetory) {
        this.maxUpMarketValueForFinishedInvetory = maxUpMarketValueForFinishedInvetory;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FactoriesGameSettings other = (FactoriesGameSettings) obj;
        return true;
    }

    public FactoriesGame getFactoriesGameId() {
        return factoriesGameId;
    }

    public void setFactoriesGameId(FactoriesGame factoriesGameId) {
        this.factoriesGameId = factoriesGameId;
    }

    @Override
    public String toString() {
        return "FactoriesGameSettings{" + "id=" + id + ", factoriesGameId=" + factoriesGameId + ", gameType=" + gameType + ", account=" + account + ", rawLowMaterialAvailable=" + rawLowMaterialAvailable + ", rawUpMaterialAvailable=" + rawUpMaterialAvailable + ", rawLowMaterialMinimumCost=" + rawLowMaterialMinimumCost + ", rawUpMaterialMinimumCost=" + rawUpMaterialMinimumCost + ", potentialLowMarketForFinishedInventory=" + potentialLowMarketForFinishedInventory + ", potentialUoMarketForFinishedInventory=" + potentialUoMarketForFinishedInventory + ", maxLowMarketValueForFinishedInvetory=" + maxLowMarketValueForFinishedInvetory + ", maxUpMarketValueForFinishedInvetory=" + maxUpMarketValueForFinishedInvetory + ", numberOfPlayers=" + numberOfPlayers + '}';
    }

    public int getMaterialStoreCosts() {
        return materialStoreCosts;
    }

    public void setMaterialStoreCosts(int materialStoreCosts) {
        this.materialStoreCosts = materialStoreCosts;
    }

    public int getProductsStoreCosts() {
        return productsStoreCosts;
    }

    public void setProductsStoreCosts(int productsStoreCosts) {
        this.productsStoreCosts = productsStoreCosts;
    }

    public int getStandardFactoryFixedCost() {
        return standardFactoryFixedCost;
    }

    public void setStandardFactoryFixedCost(int standardFactoryFixedCost) {
        this.standardFactoryFixedCost = standardFactoryFixedCost;
    }

    public int getAutomatizedFactoryConstructionCosts() {
        return automatizedFactoryConstructionCosts;
    }

    public void setAutomatizedFactoryConstructionCosts(int automatizedFactoryConstructionCosts) {
        this.automatizedFactoryConstructionCosts = automatizedFactoryConstructionCosts;
    }

    public int getMaterialStore() {
        return materialStore;
    }

    public void setMaterialStore(int materialStore) {
        this.materialStore = materialStore;
    }

    public int getProductInStore() {
        return productInStore;
    }

    public void setProductInStore(int productInStore) {
        this.productInStore = productInStore;
    }

    public int getStandardDevelopmentCost() {
        return standardDevelopmentCost;
    }

    public void setStandardDevelopmentCost(int standardDevelopmentCost) {
        this.standardDevelopmentCost = standardDevelopmentCost;
    }

    public int getAutomatizedDevelopmentCosts() {
        return automatizedDevelopmentCosts;
    }

    public void setAutomatizedDevelopmentCosts(int automatizedDevelopmentCosts) {
        this.automatizedDevelopmentCosts = automatizedDevelopmentCosts;
    }

    public int getStandardFactoryNumber() {
        return standardFactoryNumber;
    }

    public void setStandardFactoryNumber(int standardFactoryNumber) {
        this.standardFactoryNumber = standardFactoryNumber;
    }

    public int getAutomatizedFactoryNumber() {
        return automatizedFactoryNumber;
    }

    public void setAutomatizedFactoryNumber(int autmoatizedFactoryNumber) {
        this.automatizedFactoryNumber = autmoatizedFactoryNumber;
    }

    public int getInitialNumberOfGamesPerPlayer() {
        return initialNumberOfGamesPerPlayer;
    }

    public void setInitialNumberOfGamesPerPlayer(int initialNumberOfGamesPerPlayer) {
        this.initialNumberOfGamesPerPlayer = initialNumberOfGamesPerPlayer;
    }
}

 */