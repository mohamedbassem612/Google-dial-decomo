package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wkp {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController");
    public final aoss b;
    public final zpz c;
    public final defpackage.abtr d;
    private final java.lang.String e;
    private final aoin f;
    private final defpackage.whs g;
    private final zzx h;

    public wkp(aoss aossVar, java.lang.String str, defpackage.abtr abtrVar, aoin aoinVar, zpz zpzVar, defpackage.whs whsVar, zzx zzxVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "callId");
        aooh.f(abtrVar, "xatuState");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(whsVar, "xatuLoggingCoordinator");
        this.b = aossVar;
        this.e = str;
        this.d = abtrVar;
        this.f = aoinVar;
        this.c = zpzVar;
        this.g = whsVar;
        this.h = zzxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.wkk wkkVar;
        if (aolnVar instanceof defpackage.wkk) {
            wkkVar = (defpackage.wkk) aolnVar;
            int i = wkkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkkVar.c = i - Integer.MIN_VALUE;
            } else {
                wkkVar = new defpackage.wkk(this, aolnVar);
            }
        } else {
            wkkVar = new defpackage.wkk(this, aolnVar);
        }
        java.lang.Object obj = wkkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wkkVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            java.util.Collection<aoin> collectionValues = this.h.k().values();
            aooh.e(collectionValues, "<get-values>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(collectionValues, 10));
            for (aoin aoinVar : collectionValues) {
                aoss aossVar = this.b;
                ajcq ajcqVarA = ((defpackage.xdx) aoinVar.a()).a();
                aosy aosyVarAm = aoov.am(aossVar, 0, new defpackage.wcj(ajcqVarA, (aoln) null, 2), 3);
                aosyVarAm.p(new lwl(ajcqVarA, 16));
                arrayList.add(aosyVarAm);
            }
            wkkVar.c = 1;
            if (aooh.v(arrayList, wkkVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "abortAllFeatureActivations", 137, "XatuAddonCoordinatorController.kt").v("abort all addon feature activations succeeded");
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.wgz wgzVar, aoln aolnVar) {
        defpackage.wkl wklVar;
        if (aolnVar instanceof defpackage.wkl) {
            wklVar = (defpackage.wkl) aolnVar;
            int i = wklVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wklVar.c = i - Integer.MIN_VALUE;
            } else {
                wklVar = new defpackage.wkl(this, aolnVar);
            }
        } else {
            wklVar = new defpackage.wkl(this, aolnVar);
        }
        java.lang.Object objD = wklVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wklVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                wgzVar = wklVar.d;
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        defpackage.wha whaVarB = defpackage.wha.b(wgzVar.c);
        if (whaVarB == null) {
            whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
        }
        ajcq ajcqVarB = g(whaVarB).b();
        wklVar.d = wgzVar;
        wklVar.c = 1;
        objD = aosv.D(ajcqVarB, wklVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "activateAddonFeatureIfNoError", 143, "XatuAddonCoordinatorController.kt").v("cannot activate addon feature, error found");
            return aojh.a;
        }
        wklVar.d = null;
        wklVar.c = 2;
        if (c(wgzVar, wklVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.wgz wgzVar, aoln aolnVar) throws aois {
        defpackage.wkm wkmVar;
        defpackage.wha whaVarB;
        int iOrdinal;
        if (aolnVar instanceof defpackage.wkm) {
            wkmVar = (defpackage.wkm) aolnVar;
            int i = wkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkmVar.c = i - Integer.MIN_VALUE;
            } else {
                wkmVar = new defpackage.wkm(this, aolnVar);
            }
        } else {
            wkmVar = new defpackage.wkm(this, aolnVar);
        }
        java.lang.Object obj = wkmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wkmVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                wgzVar = wkmVar.d;
                aooc.af(obj);
            } else if (i2 == 2) {
                wgzVar = wkmVar.d;
                aooc.af(obj);
                wkmVar.d = wgzVar;
                wkmVar.c = 3;
                if (d(wgzVar, wkmVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wgzVar = wkmVar.d;
                aooc.af(obj);
            }
            a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "activateAddonFeatureWithoutErrorCheck", 175, "XatuAddonCoordinatorController.kt").v("addon feature activated successfully");
            whaVarB = defpackage.wha.b(wgzVar.c);
            if (whaVarB == null) {
                whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
            }
            iOrdinal = whaVarB.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    this.g.b(this.e, 20);
                } else if (iOrdinal != 2 && iOrdinal != 3) {
                    throw new aois();
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        wkmVar.d = wgzVar;
        wkmVar.c = 1;
        if (e(wgzVar, wkmVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.wha whaVarB2 = defpackage.wha.b(wgzVar.c);
        if (whaVarB2 == null) {
            whaVarB2 = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
        }
        defpackage.xdx xdxVarG = g(whaVarB2);
        defpackage.xdx.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/xatu/AtlasXatuAddonFeatureController", "activate", 38, "AtlasXatuAddonFeatureController.java").v("request hold for me activation via Direct My Call");
        ajcq ajcqVarB = xdxVarG.b.b();
        wkmVar.d = wgzVar;
        wkmVar.c = 2;
        if (aosv.D(ajcqVarB, wkmVar) == aoluVar) {
            return aoluVar;
        }
        wkmVar.d = wgzVar;
        wkmVar.c = 3;
        if (d(wgzVar, wkmVar) == aoluVar) {
            return aoluVar;
        }
        a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "activateAddonFeatureWithoutErrorCheck", 175, "XatuAddonCoordinatorController.kt").v("addon feature activated successfully");
        whaVarB = defpackage.wha.b(wgzVar.c);
        if (whaVarB == null) {
            whaVarB = defpackage.wha.ADDON_FEATURE_KEY_UNSPECIFIED;
        }
        iOrdinal = whaVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                this.g.b(this.e, 20);
            } else if (iOrdinal != 2) {
                throw new aois();
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.wgz wgzVar, aoln aolnVar) {
        defpackage.wkn wknVar;
        if (aolnVar instanceof defpackage.wkn) {
            wknVar = (defpackage.wkn) aolnVar;
            int i = wknVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wknVar.c = i - Integer.MIN_VALUE;
            } else {
                wknVar = new defpackage.wkn(this, aolnVar);
            }
        } else {
            wknVar = new defpackage.wkn(this, aolnVar);
        }
        java.lang.Object obj = wknVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wknVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (wgzVar.d) {
                a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "closeXatuUiIfNecessary", 167, "XatuAddonCoordinatorController.kt").v("addon feature activation is closing ui");
                ajcq ajcqVarB = ((defpackage.wky) this.f.a()).b();
                aooh.e(ajcqVarB, "closeUi(...)");
                wknVar.c = 1;
                if (aosv.D(ajcqVarB, wknVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.wgz wgzVar, aoln aolnVar) {
        defpackage.wko wkoVar;
        if (aolnVar instanceof defpackage.wko) {
            wkoVar = (defpackage.wko) aolnVar;
            int i = wkoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkoVar.c = i - Integer.MIN_VALUE;
            } else {
                wkoVar = new defpackage.wko(this, aolnVar);
            }
        } else {
            wkoVar = new defpackage.wko(this, aolnVar);
        }
        java.lang.Object obj = wkoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wkoVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (wgzVar.d) {
                a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "stopXatuIfNecessary", 154, "XatuAddonCoordinatorController.kt").v("addon feature activation is stopping xatu");
                ajcq ajcqVarD = ((defpackage.wky) this.f.a()).d(new defpackage.wkx(defpackage.wre.ADDON_FEATURE_ACTIVATION, j$.util.Optional.empty()));
                aooh.e(ajcqVarD, "stopSession(...)");
                wkoVar.c = 1;
                if (aosv.D(ajcqVarD, wkoVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final void f(defpackage.wgz wgzVar) {
        aooh.f(wgzVar, "activationParams");
        a.b().i(zct.a).l("com/android/dialer/xatu/impl/service/XatuAddonCoordinatorController", "activateAddonFeature", 50, "XatuAddonCoordinatorController.kt").v("enter");
        aimz aimzVar = zih.a;
        aoov.al(this.b, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, this, wgzVar, 8));
    }

    public final defpackage.xdx g(defpackage.wha whaVar) {
        defpackage.xdx xdxVar;
        aoin aoinVar = (aoin) this.h.k().get(whaVar);
        if (aoinVar != null && (xdxVar = (defpackage.xdx) aoinVar.a()) != null) {
            return xdxVar;
        }
        throw new java.lang.IllegalStateException("XatuAddonFeatureController for " + whaVar.name() + " is not bound");
    }
}
