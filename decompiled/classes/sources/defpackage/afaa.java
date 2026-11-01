package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afaa {
    public final java.lang.String a;
    public final defpackage.ahzi b;
    final defpackage.ahzi c;
    final defpackage.ahzi d;
    android.content.res.Resources e;
    public final /* synthetic */ defpackage.afab f;

    public afaa(defpackage.afab afabVar, java.lang.String str, defpackage.ahzi ahziVar) {
        j$.util.Objects.requireNonNull(afabVar);
        this.f = afabVar;
        this.a = str;
        this.b = new defpackage.aezy(new defpackage.aeex(this, 19));
        this.c = new defpackage.aezy(new defpackage.adqd(this, afabVar, str, 5));
        this.d = ahziVar;
    }

    public final android.content.res.Resources a() throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.res.Resources resources = this.e;
        if (resources != null) {
            return resources;
        }
        defpackage.afab afabVar = this.f;
        android.content.res.Resources resourcesForApplication = ((android.content.pm.PackageManager) afabVar.b).getResourcesForApplication(this.a);
        this.e = resourcesForApplication;
        return resourcesForApplication;
    }

    public final defpackage.aigf b(java.lang.String str) {
        android.content.pm.ServiceInfo serviceInfo;
        loop0: while (true) {
            serviceInfo = null;
            for (android.content.pm.ResolveInfo resolveInfo : ((android.content.pm.PackageManager) this.f.b).queryIntentServices(new android.content.Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService").setPackage(str), 787072)) {
                if (serviceInfo == null) {
                    if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.metaData != null && "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                        serviceInfo = resolveInfo.serviceInfo;
                    }
                }
            }
            break loop0;
        }
        if (serviceInfo == null) {
            android.util.Log.i("PhenotypeResourceReader", "unable to find any Phenotype resource metadata for ".concat(java.lang.String.valueOf(str)));
            return defpackage.aikj.b;
        }
        defpackage.aca acaVar = new defpackage.aca();
        defpackage.aca acaVar2 = new defpackage.aca();
        android.os.Bundle bundle = serviceInfo.metaData;
        for (java.lang.String str2 : bundle.keySet()) {
            boolean zStartsWith = str2.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
            boolean zStartsWith2 = str2.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
            if (zStartsWith || zStartsWith2) {
                int i = bundle.getInt(str2, 0);
                if (i != 0) {
                    java.lang.String str3 = (java.lang.String) defpackage.ahvr.bh(new defpackage.ahzf(new defpackage.ahyy(new defpackage.ahxd(':'))).h(str2), 1);
                    if (zStartsWith) {
                        acaVar.put(str3, java.lang.Integer.valueOf(i));
                    } else {
                        acaVar2.put(str3, java.lang.Integer.valueOf(i));
                    }
                }
            }
        }
        int i2 = acaVar.d;
        defpackage.ahvr.bC(i2, "expectedSize");
        defpackage.aigb aigbVar = new defpackage.aigb(i2);
        for (java.util.Map.Entry entry : acaVar.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getKey();
            aigbVar.i(str4, new defpackage.ajmo(this, str4, ((java.lang.Integer) entry.getValue()).intValue(), ((java.lang.Integer) acaVar2.getOrDefault(str4, 0)).intValue()));
        }
        return aigbVar.e(false);
    }
}
