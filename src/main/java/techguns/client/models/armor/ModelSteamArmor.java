package techguns.client.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public class ModelSteamArmor extends ModelBiped {

	  //fields
	    ModelRenderer RA1;
	    ModelRenderer RA2;
	    ModelRenderer RA3;
	    ModelRenderer RA4;
	    ModelRenderer RA5;
	    ModelRenderer RA6;
	    ModelRenderer RA7;
	    ModelRenderer RA8;
	    ModelRenderer LA1;
	    ModelRenderer LA2;
	    ModelRenderer LA3;
	    ModelRenderer LA4;
	    ModelRenderer LA5;
	    ModelRenderer LA6;
	    ModelRenderer LA7;
	    ModelRenderer LA8;
	    ModelRenderer H1;
	    ModelRenderer H2;
	    ModelRenderer H3;
	    ModelRenderer H4;
	    ModelRenderer H5;
	    ModelRenderer H6;
	    ModelRenderer H7;
	    ModelRenderer H8;
	    ModelRenderer H9;
	    ModelRenderer H10;
	    ModelRenderer H11;
	    ModelRenderer B1;
	    ModelRenderer B2;
	    ModelRenderer B3;
	    ModelRenderer B4;
	    ModelRenderer B5;
	    ModelRenderer B6;
	    ModelRenderer B7;
	    ModelRenderer B8;
	    ModelRenderer B9;
	    ModelRenderer B10;
	    ModelRenderer B11;
	    ModelRenderer B12;
	    ModelRenderer B13;
	    ModelRenderer B14;
	    ModelRenderer B15;
	    ModelRenderer B16;
	    ModelRenderer P1;
	    ModelRenderer P2;
	    ModelRenderer P3;
	    ModelRenderer RL1;
	    ModelRenderer RL2;
	    ModelRenderer RL3;
	    ModelRenderer RL4;
	    ModelRenderer LL1;
	    ModelRenderer LL2;
	    ModelRenderer LL3;
	    ModelRenderer LL4;
	    ModelRenderer RB1;
	    ModelRenderer RB2;
	    ModelRenderer RB3;
	    ModelRenderer LB1;
	    ModelRenderer LB2;
	    ModelRenderer LB3;
	  
	  public ModelSteamArmor(int type)
	  {
		  
      //this.bipedCloak = new ModelRenderer(this, 0, 0);
      //this.bipedEars = new ModelRenderer(this, 24, 0);
      this.bipedHead = new ModelRenderer(this, 0, 0);
      this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.bipedHeadwear = new ModelRenderer(this, 32, 0);
      this.bipedHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.bipedBody = new ModelRenderer(this, 16, 16);
      this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		  
		  //---------
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      RA1 = new ModelRenderer(this, 108, 0);
	      RA1.addBox(-1F, -4F, -1F, 2, 2, 2);
	      RA1.setRotationPoint(-2F, -1.5F, 0F);
	      RA1.setTextureSize(128, 64);
	      RA1.mirror = true;
	      setRotation(RA1, 0F, 0F, -0.5235988F);
	      RA2 = new ModelRenderer(this, 79, 48);
	      RA2.addBox(0F, 0F, 0F, 2, 2, 6);
	      RA2.setRotationPoint(-1.5F, -3.5F, -3F);
	      RA2.setTextureSize(128, 64);
	      RA2.mirror = true;
	      setRotation(RA2, 0F, 0F, 0F);
	      RA3 = new ModelRenderer(this, 96, 0);
	      RA3.addBox(-1.5F, -2F, -1.5F, 3, 2, 3);
	      RA3.setRotationPoint(-2F, -1.5F, 0F);
	      RA3.setTextureSize(128, 64);
	      RA3.mirror = true;
	      setRotation(RA3, 0F, 0F, -0.5235988F);
	      RA4 = new ModelRenderer(this, 71, 40);
	      RA4.addBox(0F, 0F, 0F, 6, 2, 6);
	      RA4.setRotationPoint(-4F, 4.5F, -3F);
	      RA4.setTextureSize(128, 64);
	      RA4.mirror = true;
	      setRotation(RA4, 0F, 0F, 0F);
	      RA5 = new ModelRenderer(this, 48, 18);
	      RA5.addBox(0F, 0F, 0F, 5, 13, 5);
	      RA5.setRotationPoint(-3.5F, -2.5F, -2.5F);
	      RA5.setTextureSize(128, 64);
	      RA5.mirror = true;
	      setRotation(RA5, 0F, 0F, 0F);
	      RA6 = new ModelRenderer(this, 71, 48);
	      RA6.addBox(0F, 0F, 0F, 2, 9, 2);
	      RA6.setRotationPoint(-4.5F, 0.5F, -1F);
	      RA6.setTextureSize(128, 64);
	      RA6.mirror = true;
	      setRotation(RA6, 0F, 0F, 0F);
	      RA7 = new ModelRenderer(this, 96, 5);
	      RA7.addBox(0F, 0F, 0F, 2, 3, 3);
	      RA7.setRotationPoint(-5F, 4F, -1.5F);
	      RA7.setTextureSize(128, 64);
	      RA7.mirror = true;
	      setRotation(RA7, 0F, 0F, 0F);
	      RA8 = new ModelRenderer(this, 71, 32);
	      RA8.addBox(0F, 0F, 0F, 6, 2, 6);
	      RA8.setRotationPoint(-4.5F, -1.5F, -3F);
	      RA8.setTextureSize(128, 64);
	      RA8.mirror = true;
	      setRotation(RA8, 0F, 0F, 0F);
	      LA1 = new ModelRenderer(this, 108, 0);
	      LA1.addBox(-1F, -4F, -1F, 2, 2, 2);
	      LA1.setRotationPoint(2F, -1.5F, 0F);
	      LA1.setTextureSize(128, 64);
	      setRotation(LA1, 0F, 0F, 0.5235988F);
	      LA2 = new ModelRenderer(this, 96, 5);
	      LA2.addBox(18F, 0F, 0F, 2, 3, 3);
	      LA2.setRotationPoint(-15F, 4F, -1.5F);
	      LA2.setTextureSize(128, 64);
	      setRotation(LA2, 0F, 0F, 0F);
	      LA3 = new ModelRenderer(this, 79, 48);
	      LA3.addBox(0F, 0F, 0F, 2, 2, 6);
	      LA3.setRotationPoint(-0.5F, -3.5F, -3F);
	      LA3.setTextureSize(128, 64);
	      setRotation(LA3, 0F, 0F, 0F);
	      LA4 = new ModelRenderer(this, 96, 0);
	      LA4.addBox(-1.5F, -2F, -1.5F, 3, 2, 3);
	      LA4.setRotationPoint(2F, -1.5F, 0F);
	      LA4.setTextureSize(128, 64);
	      setRotation(LA4, 0F, 0F, 0.5235988F);
	      LA5 = new ModelRenderer(this, 71, 32);
	      LA5.addBox(0F, 0F, 0F, 6, 2, 6);
	      LA5.setRotationPoint(-1.5F, -1.5F, -3F);
	      LA5.setTextureSize(128, 64);
	      setRotation(LA5, 0F, 0F, 0F);
	      LA6 = new ModelRenderer(this, 71, 40);
	      LA6.addBox(12F, 0F, 0F, 6, 2, 6);
	      LA6.setRotationPoint(-14F, 4.5F, -3F);
	      LA6.setTextureSize(128, 64);
	      setRotation(LA6, 0F, 0F, 0F);
	      LA7 = new ModelRenderer(this, 71, 48);
	      LA7.addBox(0F, 0F, 0F, 2, 9, 2);
	      LA7.setRotationPoint(2.5F, 0.5F, -1F);
	      LA7.setTextureSize(128, 64);
	      setRotation(LA7, 0F, 0F, 0F);
	      LA8 = new ModelRenderer(this, 48, 18);
	      LA8.addBox(0F, 0F, 0F, 5, 13, 5);
	      LA8.setRotationPoint(-1.5F, -2.5F, -2.5F);
	      LA8.setTextureSize(128, 64);
	      setRotation(LA8, 0F, 0F, 0F);
	      H1 = new ModelRenderer(this, 95, 32);
	      H1.addBox(0F, 0F, 0F, 4, 4, 2);
	      H1.setRotationPoint(-2F, -3F, -6F);
	      H1.setTextureSize(128, 64);
	      H1.mirror = true;
	      setRotation(H1, 0F, 0F, 0F);
	      H2 = new ModelRenderer(this, 36, 0);
	      H2.addBox(0F, 0F, 0F, 1, 6, 6);
	      H2.setRotationPoint(-5.5F, -7F, -3F);
	      H2.setTextureSize(128, 64);
	      H2.mirror = true;
	      setRotation(H2, 0F, 0F, 0F);
	      H3 = new ModelRenderer(this, 0, 0);
	      H3.addBox(0F, 0F, 0F, 9, 9, 9);
	      H3.setRotationPoint(-4.5F, -8.5F, -4.5F);
	      H3.setTextureSize(128, 64);
	      H3.mirror = true;
	      setRotation(H3, 0F, 0F, 0F);
	      H4 = new ModelRenderer(this, 107, 32);
	      H4.addBox(0F, 0F, 0F, 7, 2, 1);
	      H4.setRotationPoint(-3.5F, -1.5F, -5.5F);
	      H4.setTextureSize(128, 64);
	      H4.mirror = true;
	      setRotation(H4, 0F, 0F, 0F);
	      H5 = new ModelRenderer(this, 36, 0);
	      H5.addBox(0F, 0F, 0F, 1, 6, 6);
	      H5.setRotationPoint(4.5F, -7F, -3F);
	      H5.setTextureSize(128, 64);
	      H5.mirror = false;
	      setRotation(H5, 0F, 0F, 0F);
	      H6 = new ModelRenderer(this, 124, 0);
	      H6.addBox(0F, 0F, 0F, 1, 6, 1);
	      H6.setRotationPoint(-3F, -6.5F, 5.5F);
	      H6.setTextureSize(128, 64);
	      H6.mirror = true;
	      setRotation(H6, 0F, 0F, 0F);
	      H7 = new ModelRenderer(this, 107, 35);
	      H7.addBox(0F, 0F, 0F, 2, 2, 1);
	      H7.setRotationPoint(-3.5F, -2F, 4.5F);
	      H7.setTextureSize(128, 64);
	      H7.mirror = true;
	      setRotation(H7, 0F, 0F, 0F);
	      H8 = new ModelRenderer(this, 107, 35);
	      H8.addBox(0F, 0F, 0F, 2, 2, 1);
	      H8.setRotationPoint(-3.5F, -7F, 4.5F);
	      H8.setTextureSize(128, 64);
	      H8.mirror = true;
	      setRotation(H8, 0F, 0F, 0F);
	      H9 = new ModelRenderer(this, 107, 35);
	      H9.addBox(0F, 0F, 0F, 2, 2, 1);
	      H9.setRotationPoint(1.5F, -7F, 4.5F);
	      H9.setTextureSize(128, 64);
	      H9.mirror = true;
	      setRotation(H9, 0F, 0F, 0F);
	      H10 = new ModelRenderer(this, 124, 0);
	      H10.addBox(0F, 0F, 0F, 1, 6, 1);
	      H10.setRotationPoint(2F, -6.5F, 5.5F);
	      H10.setTextureSize(128, 64);
	      H10.mirror = true;
	      setRotation(H10, 0F, 0F, 0F);
	      H11 = new ModelRenderer(this, 107, 35);
	      H11.addBox(0F, 0F, 0F, 2, 2, 1);
	      H11.setRotationPoint(1.5F, -2F, 4.5F);
	      H11.setTextureSize(128, 64);
	      H11.mirror = true;
	      setRotation(H11, 0F, 0F, 0F);
	      B1 = new ModelRenderer(this, 20, 18);
	      B1.addBox(-4F, 0F, -2F, 9, 12, 5);
	      B1.setRotationPoint(-0.5F, -0.5F, -0.5F);
	      B1.setTextureSize(128, 64);
	      B1.mirror = true;
	      setRotation(B1, 0F, 0F, 0F);
	      B2 = new ModelRenderer(this, 50, 36);
	      B2.addBox(-4F, 0F, -2F, 8, 10, 2);
	      B2.setRotationPoint(0F, 0.5F, 4.5F);
	      B2.setTextureSize(128, 64);
	      B2.mirror = true;
	      setRotation(B2, 0F, 0F, 0F);
	      B3 = new ModelRenderer(this, 94, 38);
	      B3.addBox(0F, 0F, 0F, 3, 1, 2);
	      B3.setRotationPoint(-3.5F, 7.5F, 4.5F);
	      B3.setTextureSize(128, 64);
	      B3.mirror = true;
	      setRotation(B3, 0F, 0F, 0F);
	      B4 = new ModelRenderer(this, 96, 18);
	      B4.addBox(0F, 0F, 0F, 2, 1, 2);
	      B4.setRotationPoint(1F, 8.5F, 4F);
	      B4.setTextureSize(128, 64);
	      B4.mirror = true;
	      setRotation(B4, 0F, 0F, 0F);
	      B5 = new ModelRenderer(this, 96, 11);
	      B5.addBox(-4F, 0F, 0F, 3, 4, 2);
	      B5.setRotationPoint(0.5F, 3.5F, 4.5F);
	      B5.setTextureSize(128, 64);
	      B5.mirror = true;
	      setRotation(B5, 0F, 0F, 0F);
	      B6 = new ModelRenderer(this, 96, 18);
	      B6.addBox(0F, 0F, 0F, 2, 1, 2);
	      B6.setRotationPoint(-3F, 8.5F, 4F);
	      B6.setTextureSize(128, 64);
	      B6.mirror = true;
	      setRotation(B6, 0F, 0F, 0F);
	      B7 = new ModelRenderer(this, 96, 11);
	      B7.addBox(0F, 0F, 0F, 3, 4, 2);
	      B7.setRotationPoint(0.5F, 3.5F, 4.5F);
	      B7.setTextureSize(128, 64);
	      B7.mirror = true;
	      setRotation(B7, 0F, 0F, 0F);
	      B8 = new ModelRenderer(this, 94, 38);
	      B8.addBox(0F, 0F, 0F, 3, 1, 2);
	      B8.setRotationPoint(0.5F, 7.5F, 4.5F);
	      B8.setTextureSize(128, 64);
	      B8.mirror = true;
	      setRotation(B8, 0F, 0F, 0F);
	      B9 = new ModelRenderer(this, 94, 38);
	      B9.addBox(0F, 0F, 0F, 3, 1, 2);
	      B9.setRotationPoint(-3.5F, 2.5F, 4.5F);
	      B9.setTextureSize(128, 64);
	      B9.mirror = true;
	      setRotation(B9, 0F, 0F, 0F);
	      B10 = new ModelRenderer(this, 94, 38);
	      B10.addBox(0F, 0F, 0F, 3, 1, 2);
	      B10.setRotationPoint(0.5F, 2.5F, 4.5F);
	      B10.setTextureSize(128, 64);
	      B10.mirror = true;
	      setRotation(B10, 0F, 0F, 0F);
	      B11 = new ModelRenderer(this, 113, 18);
	      B11.addBox(0F, 0F, 0F, 2, 3, 2);
	      B11.setRotationPoint(-3F, 4.5F, 4F);
	      B11.setTextureSize(128, 64);
	      B11.mirror = true;
	      setRotation(B11, 0F, 0F, 0F);
	      B12 = new ModelRenderer(this, 96, 18);
	      B12.addBox(0F, 0F, 0F, 2, 1, 2);
	      B12.setRotationPoint(-3F, 1.5F, 4F);
	      B12.setTextureSize(128, 64);
	      B12.mirror = true;
	      setRotation(B12, 0F, 0F, 0F);
	      B13 = new ModelRenderer(this, 50, 5);
	      B13.addBox(0F, 0F, 0F, 5, 4, 1);
	      B13.setRotationPoint(-2.5F, 6.5F, -3.5F);
	      B13.setTextureSize(128, 64);
	      B13.mirror = true;
	      setRotation(B13, 0F, 0F, 0F);
	      B14 = new ModelRenderer(this, 50, 0);
	      B14.addBox(0F, 0F, 0F, 7, 4, 1);
	      B14.setRotationPoint(-3.5F, 1.5F, -3.5F);
	      B14.setTextureSize(128, 64);
	      B14.mirror = true;
	      setRotation(B14, 0F, 0F, 0F);
	      B15 = new ModelRenderer(this, 96, 18);
	      B15.addBox(0F, 0F, 0F, 2, 1, 2);
	      B15.setRotationPoint(1F, 1.5F, 4F);
	      B15.setTextureSize(128, 64);
	      B15.mirror = true;
	      setRotation(B15, 0F, 0F, 0F);
	      B16 = new ModelRenderer(this, 120, 18);
	      B16.addBox(0F, 0F, 0F, 2, 3, 2);
	      B16.setRotationPoint(1F, 4.5F, 4F);
	      B16.setTextureSize(128, 64);
	      B16.mirror = true;
	      setRotation(B16, 0F, 0F, 0F);
	      P1 = new ModelRenderer(this, 95, 41);
	      P1.addBox(0F, 0F, 0F, 10, 2, 6);
	      P1.setRotationPoint(-5F, 11F, -3F);
	      P1.setTextureSize(128, 64);
	      P1.mirror = true;
	      setRotation(P1, 0F, 0F, 0F);
	      P2 = new ModelRenderer(this, 20, 47);
	      P2.addBox(0F, 0F, 0F, 9, 3, 5);
	      P2.setRotationPoint(-4.5F, 11.5F, -2.5F);
	      P2.setTextureSize(128, 64);
	      P2.mirror = true;
	      setRotation(P2, 0F, 0F, 0F);
	      P3 = new ModelRenderer(this, 84, 56);
	      P3.addBox(0F, 0F, 0F, 2, 2, 6);
	      P3.setRotationPoint(-1F, 13F, -3F);
	      P3.setTextureSize(128, 64);
	      P3.mirror = true;
	      setRotation(P3, 0F, 0F, 0F);
	      RL1 = new ModelRenderer(this, 0, 47);
	      RL1.addBox(-2F, 0F, -2F, 5, 9, 5);
	      RL1.setRotationPoint(-0.6F, -0.5F, -0.5F);
	      RL1.setTextureSize(128, 64);
	      RL1.mirror = true;
	      setRotation(RL1, 0F, 0F, 0F);
	      RL2 = new ModelRenderer(this, 96, 5);
	      RL2.addBox(0F, 0F, 0F, 2, 3, 3);
	      RL2.setRotationPoint(-4.1F, 4.5F, -1.5F);
	      RL2.setTextureSize(128, 64);
	      RL2.mirror = true;
	      setRotation(RL2, 0F, 0F, 0F);
	      RL3 = new ModelRenderer(this, 71, 32);
	      RL3.addBox(0F, 0F, 0F, 5, 2, 6);
	      RL3.setRotationPoint(-3.1F, 5F, -3F);
	      RL3.setTextureSize(128, 64);
	      RL3.mirror = true;
	      setRotation(RL3, 0F, 0F, 0F);
	      RL4 = new ModelRenderer(this, 71, 48);
	      RL4.addBox(0F, 0F, 0F, 2, 10, 2);
	      RL4.setRotationPoint(-3.6F, 0.5F, -1F);
	      RL4.setTextureSize(128, 64);
	      RL4.mirror = true;
	      setRotation(RL4, 0F, 0F, 0F);
	      LL1 = new ModelRenderer(this, 71, 48);
	      LL1.addBox(0F, 0F, 0F, 2, 10, 2);
	      LL1.setRotationPoint(1.6F, 0.5F, -1F);
	      LL1.setTextureSize(128, 64);
	      setRotation(LL1, 0F, 0F, 0F);
	      LL2 = new ModelRenderer(this, 0, 47);
	      LL2.addBox(-2F, 0F, -2F, 5, 9, 5);
	      LL2.setRotationPoint(-0.4F, -0.5F, -0.5F);
	      LL2.setTextureSize(128, 64);
	      setRotation(LL2, 0F, 0F, 0F);
	      LL3 = new ModelRenderer(this, 96, 5);
	      LL3.addBox(0F, 0F, 0F, 2, 3, 3);
	      LL3.setRotationPoint(2.1F, 4.5F, -1.5F);
	      LL3.setTextureSize(128, 64);
	      setRotation(LL3, 0F, 0F, 0F);
	      LL4 = new ModelRenderer(this, 71, 32);
	      LL4.addBox(0F, 0F, 0F, 5, 2, 6);
	      LL4.setRotationPoint(-1.9F, 5F, -3F);
	      LL4.setTextureSize(128, 64);
	      setRotation(LL4, 0F, 0F, 0F);
	      RB1 = new ModelRenderer(this, 95, 49);
	      RB1.addBox(-2F, 0F, -2F, 3, 3, 1);
	      RB1.setRotationPoint(0.4F, 9.5F, -1.5F);
	      RB1.setTextureSize(128, 64);
	      RB1.mirror = true;
	      setRotation(RB1, 0F, 0F, 0F);
	      RB2 = new ModelRenderer(this, 100, 56);
	      RB2.addBox(0F, 0F, 0F, 6, 2, 6);
	      RB2.setRotationPoint(-3.1F, 10F, -3F);
	      RB2.setTextureSize(128, 64);
	      RB2.mirror = true;
	      setRotation(RB2, 0F, 0F, 0F);
	      RB3 = new ModelRenderer(this, 0, 18);
	      RB3.addBox(-2F, 0F, -2F, 5, 4, 5);
	      RB3.setRotationPoint(-0.6F, 8.5F, -0.5F);
	      RB3.setTextureSize(128, 64);
	      RB3.mirror = true;
	      setRotation(RB3, 0F, 0F, 0F);
	      LB1 = new ModelRenderer(this, 95, 49);
	      LB1.addBox(-2F, 0F, -2F, 3, 3, 1);
	      LB1.setRotationPoint(0.6F, 9.5F, -1.5F);
	      LB1.setTextureSize(128, 64);
	      setRotation(LB1, 0F, 0F, 0F);
	      LB2 = new ModelRenderer(this, 100, 56);
	      LB2.addBox(0F, 0F, 0F, 6, 2, 6);
	      LB2.setRotationPoint(-2.9F, 10F, -3F);
	      LB2.setTextureSize(128, 64);
	      setRotation(LB2, 0F, 0F, 0F);
	      LB3 = new ModelRenderer(this, 0, 18);
	      LB3.addBox(2F, 0F, -2F, 5, 4, 5);
	      LB3.setRotationPoint(-4.4F, 8.5F, -0.5F);
	      LB3.setTextureSize(128, 64);
	      setRotation(LB3, 0F, 0F, 0F);
	      
	      if (type == 0) {
		      this.bipedRightArm.addChild(RA1);
		      this.bipedRightArm.addChild(RA2);
		      this.bipedRightArm.addChild(RA3);
		      this.bipedRightArm.addChild(RA4);
		      this.bipedRightArm.addChild(RA5);
		      this.bipedRightArm.addChild(RA6);
		      this.bipedRightArm.addChild(RA7);
		      this.bipedRightArm.addChild(RA8);
		      
		      this.bipedLeftArm.addChild(LA1);
		      this.bipedLeftArm.addChild(LA2);
		      this.bipedLeftArm.addChild(LA3);
		      this.bipedLeftArm.addChild(LA4);
		      this.bipedLeftArm.addChild(LA5);
		      this.bipedLeftArm.addChild(LA6);
		      this.bipedLeftArm.addChild(LA7);
		      this.bipedLeftArm.addChild(LA8);
	
		      this.bipedHead.addChild(H1);
		      this.bipedHead.addChild(H2);
		      this.bipedHead.addChild(H3);
		      this.bipedHead.addChild(H4);
		      this.bipedHead.addChild(H5);
		      this.bipedHead.addChild(H6);
		      this.bipedHead.addChild(H7);
		      this.bipedHead.addChild(H8);
		      this.bipedHead.addChild(H9);
		      this.bipedHead.addChild(H10);
		      this.bipedHead.addChild(H11);
		      
		      this.bipedBody.addChild(B1);
		      this.bipedBody.addChild(B2);
		      this.bipedBody.addChild(B3);
		      this.bipedBody.addChild(B4);
		      this.bipedBody.addChild(B5);
		      this.bipedBody.addChild(B6);
		      this.bipedBody.addChild(B7);
		      this.bipedBody.addChild(B8);
		      this.bipedBody.addChild(B9);
		      this.bipedBody.addChild(B10);
		      this.bipedBody.addChild(B11);
		      this.bipedBody.addChild(B12);
		      this.bipedBody.addChild(B13);
		      this.bipedBody.addChild(B14);
		      this.bipedBody.addChild(B15);
		      this.bipedBody.addChild(B16);
		      
		      this.bipedRightLeg.addChild(RB1);
		      this.bipedRightLeg.addChild(RB2);
		      this.bipedRightLeg.addChild(RB3);
		      
		      this.bipedLeftLeg.addChild(LB1);
		      this.bipedLeftLeg.addChild(LB2);
		      this.bipedLeftLeg.addChild(LB3);

	  	} else {
		      this.bipedBody.addChild(P1);
		      this.bipedBody.addChild(P2);
		      this.bipedBody.addChild(P3);
		     
	
		      this.bipedRightLeg.addChild(RL1);
		      this.bipedRightLeg.addChild(RL2);
		      this.bipedRightLeg.addChild(RL3);
		      this.bipedRightLeg.addChild(RL4);
		      
		      this.bipedLeftLeg.addChild(LL1);
		      this.bipedLeftLeg.addChild(LL2);
		      this.bipedLeftLeg.addChild(LL3);
		      this.bipedLeftLeg.addChild(LL4);
	      }


	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
}
