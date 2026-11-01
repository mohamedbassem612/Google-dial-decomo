package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mbq extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbq(defpackage.aeem aeemVar, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aeemVar;
        this.c = accountRepresentation;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.mbq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 1) {
            return ((defpackage.mbq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.mbq) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kfj] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.aolu aoluVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.zbu zbuVar;
        defpackage.zar zarVar;
        java.lang.Object obj4;
        java.lang.Object obj5;
        int i = this.$cid;
        if (i == 0) {
            aoluVar = defpackage.aolu.a;
            if (this.b == 0) {
                defpackage.aooc.af(obj);
                defpackage.zbu zbuVar2 = (defpackage.zbu) this.c;
                int i2 = zbuVar2.a;
                defpackage.afab afabVar = new defpackage.afab();
                afabVar.a = i2;
                afabVar.e(defpackage.abrz.h());
                defpackage.zar zarVar2 = zbuVar2.c;
                j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(zbuVar2.e - zbuVar2.d);
                defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
                afabVar.d(defpackage.gus.aE(zarVar2, durationOfMillis));
                j$.util.Optional optional = ((defpackage.mbr) this.d).b;
                if (optional == null) {
                    defpackage.aooh.i("<this>");
                }
                defpackage.kaw kawVar = (defpackage.kaw) optional.orElse((java.lang.Object) null);
                obj3 = afabVar;
                if (kawVar != null) {
                    java.lang.String str = zbuVar2.f;
                    this.a = afabVar;
                    this.b = 1;
                    obj = kawVar.U(str, this);
                    if (obj != aoluVar) {
                        obj2 = afabVar;
                    }
                }
                java.lang.Object obj6 = this.d;
                ((defpackage.mbr) obj6).c.e(((defpackage.afab) obj3).j());
                zbuVar = (defpackage.zbu) this.c;
                zarVar = zbuVar.c;
                if (zarVar != defpackage.zar.OK) {
                    ((defpackage.aimw) defpackage.mbr.a.b().l("com/android/dialer/cui/impl/DialerGilObserver", "onEvent$<anonymous>", 45, "DialerGilObserver.kt")).I("Logging failed CUI %s with result %s to GIL", zbuVar.b, zarVar.name());
                }
                return defpackage.aojh.a;
            }
            java.lang.Object obj7 = this.a;
            defpackage.aooc.af(obj);
            obj2 = obj7;
            defpackage.acme acmeVar = (defpackage.acme) obj;
            if (acmeVar != null) {
                ((defpackage.afab) obj2).d(acmeVar);
            }
            obj3 = obj2;
            java.lang.Object obj8 = this.d;
            ((defpackage.mbr) obj8).c.e(((defpackage.afab) obj3).j());
            zbuVar = (defpackage.zbu) this.c;
            zarVar = zbuVar.c;
            if (zarVar != defpackage.zar.OK) {
                ((defpackage.aimw) defpackage.mbr.a.b().l("com/android/dialer/cui/impl/DialerGilObserver", "onEvent$<anonymous>", 45, "DialerGilObserver.kt")).I("Logging failed CUI %s with result %s to GIL", zbuVar.b, zarVar.name());
            }
            return defpackage.aojh.a;
        }
        if (i != 1) {
            defpackage.aolu aoluVar2 = defpackage.aolu.a;
            if (this.b != 0) {
                obj5 = this.a;
                try {
                    defpackage.aooc.af(obj);
                } catch (java.lang.Exception e) {
                    e = e;
                    defpackage.aooc.Y(u());
                    return new adtw(e, (defpackage.adty) obj5);
                }
            } else {
                defpackage.aooc.af(obj);
                java.lang.Object obj9 = this.d;
                ?? r0 = this.c;
                defpackage.adty adtyVar = defpackage.adty.W;
                try {
                    defpackage.aeeh aeehVar = (defpackage.aeeh) ((defpackage.aeem) obj9).a.a();
                    int iBU = defpackage.agab.bU(r0);
                    java.lang.String strA = r0.a();
                    this.a = adtyVar;
                    this.b = 1;
                    obj = aeehVar.e(iBU, strA, this);
                    if (obj == aoluVar2) {
                        return aoluVar2;
                    }
                    obj5 = adtyVar;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    obj5 = adtyVar;
                    defpackage.aooc.Y(u());
                    return new adtw(e, (defpackage.adty) obj5);
                }
            }
            return new defpackage.adub(obj);
        }
        aoluVar = defpackage.aolu.a;
        int i3 = this.b;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    defpackage.aooc.af(obj);
                    return null;
                }
                obj4 = this.a;
                defpackage.aooc.af(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    throw ((java.lang.Throwable) obj4);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kfm.a.d()).k((java.lang.Throwable) obj4).l("com/android/dialer/calllog/datasources/systemcalllog/SystemCallLogDataSource", "fill$<anonymous>", 139, "SystemCallLogDataSource.kt")).v("fill missing call log read permission");
                return null;
            }
            defpackage.aooc.af(obj);
            java.lang.Object obj10 = this.c;
            ?? r3 = this.d;
            this.b = 1;
            if (((defpackage.kfm) obj10).c(r3, this) != aoluVar) {
                return null;
            }
        } catch (java.lang.Exception e3) {
            java.lang.Object obj11 = this.c;
            this.a = e3;
            this.b = 2;
            java.lang.Object objJ = ((defpackage.kfm) obj11).e.j(this);
            if (objJ != aoluVar) {
                obj = objJ;
                obj4 = e3;
            }
            return aoluVar;
        }
        return aoluVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kfj] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, zbo] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.mbq((defpackage.zbo) this.c, (defpackage.mbr) this.d, aolnVar, 0);
        }
        if (i != 1) {
            return new defpackage.mbq((defpackage.aeem) this.d, (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) this.c, aolnVar, 2);
        }
        return new defpackage.mbq((defpackage.kfm) this.c, (defpackage.kfj) this.d, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbq(defpackage.kfm kfmVar, defpackage.kfj kfjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = kfmVar;
        this.d = kfjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbq(defpackage.zbo zboVar, defpackage.mbr mbrVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = zboVar;
        this.d = mbrVar;
    }
}
