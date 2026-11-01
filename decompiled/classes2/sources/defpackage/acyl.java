package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class acyl implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ alad d;
    public final /* synthetic */ alad e;

    public /* synthetic */ acyl(acyu acyuVar, acvu acvuVar, acvr acvrVar, acwe acweVar, long j, int i) {
        this.$cid = i;
        this.b = acyuVar;
        this.c = acvuVar;
        this.d = acvrVar;
        this.e = acweVar;
        this.a = j;
    }

    public final ajcq a(java.lang.Object obj) {
        if (this.$cid == 0) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                return ajcm.a;
            }
            long j = this.a;
            acwe acweVar = this.e;
            return ((acyu) this.b).r((acvu) this.c, this.d, acweVar, j);
        }
        alad aladVar = this.d;
        alad aladVar2 = this.e;
        java.lang.Object obj2 = this.b;
        final j$.util.Optional optional = (j$.util.Optional) obj;
        final java.lang.String str = (java.lang.String) obj2;
        final defpackage.lkb lkbVar = (defpackage.lkb) aladVar2;
        final defpackage.lgp lgpVar = (defpackage.lgp) aladVar;
        return ((defpackage.lju) this.c).e.e(java.lang.Long.toString(this.a), new java.util.function.Consumer() { // from class: ljt
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj3) {
                defpackage.lkq lkqVar = (defpackage.lkq) obj3;
                lkqVar.b = lgpVar;
                lkqVar.d = false;
                akzx akzxVarM = defpackage.lka.a.m();
                java.lang.String string = java.util.UUID.randomUUID().toString();
                akzxVarM.u();
                defpackage.lka lkaVar = (defpackage.lka) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                lkaVar.b |= 1;
                lkaVar.c = string;
                for (defpackage.ljw ljwVar : lkbVar.j) {
                    int i = ljwVar.b;
                    int iY = a.Y(i);
                    if (iY == 0) {
                        throw null;
                    }
                    if (iY == 7) {
                        int iAd = a.ad((i == 6 ? (defpackage.lkd) ljwVar.c : defpackage.lkd.a).d);
                        if (iAd == 0) {
                            iAd = 1;
                        }
                        akzxVarM.u();
                        defpackage.lka lkaVar2 = (defpackage.lka) akzxVarM.b;
                        lkaVar2.d = iAd - 1;
                        lkaVar2.b |= 2;
                    }
                }
                j$.util.Optional optional2 = optional;
                java.lang.String str2 = str;
                akzx akzxVarM2 = defpackage.ljx.a.m();
                akzx akzxVarM3 = defpackage.ljy.a.m();
                akzxVarM3.u();
                defpackage.ljy ljyVar = (defpackage.ljy) akzxVarM3.b;
                ljyVar.b |= 1;
                ljyVar.c = true;
                akzxVarM3.u();
                defpackage.ljy ljyVar2 = (defpackage.ljy) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str2);
                ljyVar2.b |= 8;
                ljyVar2.f = str2;
                akzxVarM2.u();
                defpackage.ljx ljxVar = (defpackage.ljx) akzxVarM2.b;
                defpackage.ljy ljyVar3 = (defpackage.ljy) akzxVarM3.p();
                j$.util.Objects.requireNonNull(ljyVar3);
                ljxVar.c = ljyVar3;
                ljxVar.b |= 1;
                akzxVarM2.u();
                defpackage.ljx ljxVar2 = (defpackage.ljx) akzxVarM2.b;
                defpackage.lka lkaVar3 = (defpackage.lka) akzxVarM.p();
                j$.util.Objects.requireNonNull(lkaVar3);
                ljxVar2.e = lkaVar3;
                ljxVar2.b |= 4;
                defpackage.kwv kwvVar = new defpackage.kwv(akzxVarM2, 16);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj4 = optional2.get();
                    java.lang.Object obj5 = kwvVar.a;
                    java.lang.String str3 = (java.lang.String) obj4;
                    akzx akzxVarM4 = defpackage.ljz.a.m();
                    akzxVarM4.u();
                    defpackage.ljz ljzVar = (defpackage.ljz) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(str3);
                    ljzVar.b |= 1;
                    ljzVar.c = str3;
                    akzx akzxVar = (akzx) obj5;
                    akzxVar.u();
                    defpackage.ljx ljxVar3 = (defpackage.ljx) akzxVar.b;
                    defpackage.ljz ljzVar2 = (defpackage.ljz) akzxVarM4.p();
                    j$.util.Objects.requireNonNull(ljzVar2);
                    ljxVar3.d = ljzVar2;
                    ljxVar3.b |= 2;
                }
                lkqVar.g = (defpackage.ljx) akzxVarM2.p();
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
            }
        }, j$.time.Instant.now().toEpochMilli());
    }

    public /* synthetic */ acyl(defpackage.lju ljuVar, long j, defpackage.lgp lgpVar, defpackage.lkb lkbVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = ljuVar;
        this.a = j;
        this.d = lgpVar;
        this.e = lkbVar;
        this.b = str;
    }
}
