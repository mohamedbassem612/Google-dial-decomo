package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajxm {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public ajxm(defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.ahda ahdaVar, defpackage.zzx zzxVar, defpackage.aewq aewqVar) {
        if (ajctVar == null) {
            defpackage.aooh.i("blockingExecutor");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("processReaper");
        }
        if (zzxVar == null) {
            defpackage.aooh.i("observedPackages");
        }
        if (aewqVar == null) {
            defpackage.aooh.i("phenotypeContext");
        }
        this.d = ajctVar;
        this.b = aoinVar;
        this.e = ahdaVar;
        this.a = zzxVar;
        this.c = aewqVar;
        this.f = new defpackage.aoiy(new defpackage.abnb(17));
    }

    public final java.lang.String a() {
        try {
            return android.util.Base64.encodeToString(java.security.MessageDigest.getInstance("SHA-1").digest(((defpackage.ajtc) this.a).e().getBytes()), 11);
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public ajxm(defpackage.ajtc ajtcVar, defpackage.ajxo ajxoVar, defpackage.aabo aaboVar, defpackage.ajwe ajweVar, defpackage.ajwe ajweVar2, defpackage.ajwi ajwiVar) {
        this.a = ajtcVar;
        this.b = ajxoVar;
        this.c = aaboVar;
        this.d = ajweVar;
        this.e = ajweVar2;
        this.f = ajwiVar;
    }

    public ajxm(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6) {
        aoinVar.getClass();
        this.f = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.e = aoinVar3;
        aoinVar4.getClass();
        this.c = aoinVar4;
        aoinVar5.getClass();
        this.a = aoinVar5;
        aoinVar6.getClass();
        this.d = aoinVar6;
    }
}
