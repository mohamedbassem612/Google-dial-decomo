package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class rs {
    static java.util.Map a(android.app.appsearch.SearchResult searchResult) {
        return searchResult.getParentTypeMap();
    }

    public static defpackage.uv b(defpackage.tt ttVar, defpackage.tw twVar) {
        int i = ttVar.d;
        if (i == 0) {
            throw new java.lang.IllegalStateException("Car App API level hasn't been established yet");
        }
        if (i < 3) {
            throw new defpackage.tx("Create CarHardwareManager failed", new java.lang.IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
        }
        try {
            android.content.pm.ServiceInfo serviceInfoA = defpackage.to.a(ttVar);
            java.lang.String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
            if (string != null) {
                return (defpackage.uv) java.lang.Class.forName(string).getConstructor(defpackage.tt.class, defpackage.tw.class).newInstance(ttVar, twVar);
            }
            throw new java.lang.ClassNotFoundException("CarHardwareManager metadata could not be found");
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ReflectiveOperationException unused) {
            throw new java.lang.IllegalStateException("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
        }
    }

    public static final boolean c(cvf cvfVar) {
        return cvfVar.b == 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object d(ati atiVar, float f, aoln aolnVar) {
        defpackage.ast astVar;
        aooq aooqVar;
        if (aolnVar instanceof defpackage.ast) {
            astVar = (defpackage.ast) aolnVar;
            int i = astVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                astVar.b = i - Integer.MIN_VALUE;
            } else {
                astVar = new defpackage.ast(aolnVar);
            }
        } else {
            astVar = new defpackage.ast(aolnVar);
        }
        java.lang.Object obj = astVar.a;
        aolu aoluVar = aolu.a;
        int i2 = astVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            aooq aooqVar2 = new aooq();
            defpackage.asu asuVar = new defpackage.asu(aooqVar2, f, null);
            astVar.c = aooqVar2;
            astVar.b = 1;
            if (atiVar.d(defpackage.aoc.a, asuVar, astVar) == aoluVar) {
                return aoluVar;
            }
            aooqVar = aooqVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooqVar = astVar.c;
            aooc.af(obj);
        }
        return new java.lang.Float(aooqVar.a);
    }

    public static final defpackage.cnj e(java.lang.String str) {
        return new defpackage.cnd(ajsz.aF(str));
    }

    public static final java.lang.String[] f(defpackage.cnj cnjVar) {
        aooh.d(cnjVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (java.lang.String[]) ((defpackage.cnd) cnjVar).a.toArray(new java.lang.String[0]);
    }

    public static final android.view.autofill.AutofillValue g(java.lang.String str) {
        int length = str.length();
        java.lang.CharSequence charSequenceX = str;
        if (length > 5000) {
            charSequenceX = (java.lang.Character.isHighSurrogate(str.charAt(4999)) && java.lang.Character.isLowSurrogate(str.charAt(5000))) ? aoov.X(str, 4999) : aoov.X(str, 5000);
        }
        return rs$.ExternalSyntheticApiModelOutline0.m(charSequenceX);
    }

    public static final void h(java.lang.Throwable th, aomy aomyVar) {
        java.util.List listCw;
        java.lang.Object objInvoke;
        aooh.f(th, "exception");
        java.lang.Throwable th2 = null;
        if (aomn.c()) {
            java.lang.Throwable[] suppressed = th.getSuppressed();
            aooh.e(suppressed, "getSuppressed(...)");
            listCw = ajsz.cw(suppressed);
        } else {
            aooh.f(th, "exception");
            java.lang.reflect.Method method = aoml.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null || (listCw = ajsz.cw((java.lang.Throwable[]) objInvoke)) == null) {
                listCw = aokc.a;
            }
        }
        int size = listCw.size();
        for (int i = 0; i < size; i++) {
            if (((java.lang.Throwable) listCw.get(i)) instanceof defpackage.cme) {
                return;
            }
        }
        try {
            if (((akwb) aomyVar.a()) != null) {
                throw null;
            }
        } catch (java.lang.Throwable th3) {
            th2 = th3;
        }
        if (th2 != null) {
            aoil.b(th, th2);
        }
    }
}
