package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbh implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ tbh(acyu acyuVar, defpackage.acvu acvuVar, int i, int i2, int i3) {
        this.$cid = i3;
        this.d = acyuVar;
        this.c = acvuVar;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ajas, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.tbj) this.c).b((java.io.File) this.d, this.a + 1, this.b);
        }
        if (i == 1) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            int i2 = this.a;
            if (!zBooleanValue) {
                defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playRingingSound", 194, "RevelioInCallAudioPlayer.java").v("Avatar session stopped listening; no longer playing ringing sound to caller");
                return aiql.z(java.lang.Integer.valueOf(i2));
            }
            int i3 = this.b;
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.c;
            defpackage.tbj tbjVar = (defpackage.tbj) obj3;
            return ahvr.I(tbjVar.b.d((java.io.File) obj2, "RINGING"), new defpackage.tbh(obj3, obj2, i2, i3, 0), tbjVar.c);
        }
        if (i == 2) {
            boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj4 = this.c;
            if (!zBooleanValue2) {
                adbe.d("%s: Subscribing to file failed for group: %s", "FileGroupManager", ((defpackage.acvu) obj4).d);
                return aiql.z(java.lang.Boolean.FALSE);
            }
            return ((acyu) this.d).o((defpackage.acvu) obj4, this.a + 1, this.b);
        }
        final ahyn ahynVar = (ahyn) obj;
        if (!ahynVar.f()) {
            return ajcm.a;
        }
        final int i4 = this.b;
        final int i5 = this.a;
        ?? r2 = this.d;
        final adbk adbkVar = (adbk) this.c;
        return defpackage.adcs.e(r2.a()).f(new ahyc() { // from class: adbg
            public final java.lang.Object apply(java.lang.Object obj5) {
                java.util.List list = (java.util.List) obj5;
                if (list == null) {
                    return null;
                }
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ahyn ahynVar2 = ahynVar;
                    adbkVar.r(i5, ((aiwo) it.next()).p(), i4, (aixg) ahynVar2.b());
                }
                return null;
            }
        }, ajbm.a);
    }

    public /* synthetic */ tbh(java.lang.Object obj, java.lang.Object obj2, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = obj;
        this.d = obj2;
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ tbh(defpackage.tbj tbjVar, int i, java.io.File file, int i2, int i3) {
        this.$cid = i3;
        this.c = tbjVar;
        this.a = i;
        this.d = file;
        this.b = i2;
    }
}
