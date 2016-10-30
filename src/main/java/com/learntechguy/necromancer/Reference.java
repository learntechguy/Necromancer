package com.learntechguy.necromancer;

public class Reference {
	public static final String MOD_ID = "necromancer";
	public static final String NAME = "Necromancer";
	public static final String VERSION = "0.1";
	public static final String ACCEPTED_VERSIONS = "[1.10]";
	
	public static final String CLIENT_PROXY_CLASS = "netknight.necromancer.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "netknight.necromancer.proxy.ServerProxy";
	
	public static enum NecromancerItems {
		BRAIN("brain", "brain");
		
		private String unlocalizedName;
		private String registryName;
		
		NecromancerItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum NecromancerBlocks {
		PIKE("pike", "pike");
		
		private String unlocalizedName;
		private String registryName;
		
		NecromancerBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}