package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahus {
    private static volatile anpk a;
    private static volatile anpk b;
    private static volatile anpk c;
    private static volatile anpk d;
    private static volatile anpk e;
    private static volatile anpk f;
    private static volatile anpk g;
    private static volatile anqq h;

    private ahus() {
    }

    public static aihd A(j$.util.Optional optional, aihd aihdVar) {
        return optional.isPresent() ? (aihd) j$.util.Collection.-EL.stream(((aikj) optional.get()).e()).filter(new alks(aihdVar, 8)).map(new alki(16)).map(new alki(17)).collect(aido.b) : aikn.a;
    }

    public static final apjb B(ahur ahurVar) {
        anqq anqqVar = h;
        if (anqqVar == null) {
            synchronized (defpackage.ahus.class) {
                anqqVar = h;
                if (anqqVar == null) {
                    apjb apjbVar = new apjb("com.google.assistant.appactions.service.proto.AppActionsService");
                    apjbVar.l(f());
                    apjbVar.l(b());
                    apjbVar.l(g());
                    apjbVar.l(e());
                    apjbVar.l(d());
                    apjbVar.l(a());
                    apjbVar.l(c());
                    anqqVar = new anqq(apjbVar);
                    h = anqqVar;
                }
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        anpk anpkVarF = f();
        aohx aohxVar = new aohx(new defpackage.amwp(ahurVar, 0), 0);
        java.lang.String str = anqqVar.a;
        antw.l(anpkVarF, aohxVar, str, anqqVar, map);
        antw.l(b(), new aohx(new defpackage.amwp(ahurVar, 5), 1), str, anqqVar, map);
        antw.l(g(), new aohx(new defpackage.amwp(ahurVar, 6), 1), str, anqqVar, map);
        antw.l(e(), new aohx(new defpackage.amwp(ahurVar, 1), 0), str, anqqVar, map);
        antw.l(d(), new aohx(new defpackage.amwp(ahurVar, 2), 0), str, anqqVar, map);
        antw.l(a(), new aohx(new defpackage.amwp(ahurVar, 3), 0), str, anqqVar, map);
        antw.l(c(), new aohx(new defpackage.amwp(ahurVar, 4), 0), str, anqqVar, map);
        return antw.y(str, anqqVar, map);
    }

    public static final /* synthetic */ defpackage.uzx C(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.uzx(akzxVar);
    }

    public static final /* synthetic */ defpackage.zoe D(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.zoe(akzxVar);
    }

    public static final /* synthetic */ defpackage.vaa E(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vaa(akzxVar);
    }

    public static final /* synthetic */ defpackage.vaa F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vaa(akzxVar);
    }

    public static final /* synthetic */ defpackage.vqu G(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqu(akzxVar);
    }

    public static final /* synthetic */ defpackage.vqu H(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new defpackage.vqu(akzzVar);
    }

    public static final /* synthetic */ ajyi I(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new ajyi(akzzVar);
    }

    public static final /* synthetic */ ajyi J(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.zoe K(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.zoe(akzxVar);
    }

    public static final /* synthetic */ defpackage.zoe L(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.zoe(akzxVar);
    }

    public static final /* synthetic */ defpackage.vqu M(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.vqu(akzxVar);
    }

    public static final /* synthetic */ defpackage.zoe N(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.zoe(akzxVar);
    }

    public static anpk a() {
        anpk anpkVarA = f;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = f;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestCollection");
                    aalVarD.b();
                    defpackage.ahva ahvaVar = defpackage.ahva.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahvaVar);
                    aalVarD.c = new aohc(defpackage.ahvf.a);
                    anpkVarA = aalVarD.a();
                    f = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static anpk b() {
        anpk anpkVarA = b;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = b;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.d;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestFulfillment");
                    aalVarD.b();
                    defpackage.ahvh ahvhVar = defpackage.ahvh.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahvhVar);
                    aalVarD.c = new aohc(defpackage.ahvi.a);
                    anpkVarA = aalVarD.a();
                    b = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static anpk c() {
        anpk anpkVarA = g;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = g;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestGrounding");
                    aalVarD.b();
                    defpackage.ahuf ahufVar = defpackage.ahuf.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahufVar);
                    aalVarD.c = new aohc(defpackage.ahug.a);
                    anpkVarA = aalVarD.a();
                    g = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static anpk d() {
        anpk anpkVarA = e;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = e;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestUi");
                    aalVarD.b();
                    defpackage.ahvn ahvnVar = defpackage.ahvn.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahvnVar);
                    aalVarD.c = new aohc(defpackage.ahvo.a);
                    anpkVarA = aalVarD.a();
                    e = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static anpk e() {
        anpk anpkVarA = d;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = d;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "SendRequestFulfillment");
                    aalVarD.b();
                    defpackage.ahvh ahvhVar = defpackage.ahvh.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahvhVar);
                    aalVarD.c = new aohc(defpackage.ahvi.a);
                    anpkVarA = aalVarD.a();
                    d = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static anpk f() {
        anpk anpkVarA = a;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = a;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "StartSession");
                    aalVarD.b();
                    defpackage.ahvk ahvkVar = defpackage.ahvk.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahvkVar);
                    aalVarD.c = new aohc(defpackage.ahvl.a);
                    anpkVarA = aalVarD.a();
                    a = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static anpk g() {
        anpk anpkVarA = c;
        if (anpkVarA == null) {
            synchronized (defpackage.ahus.class) {
                anpkVarA = c;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.d;
                    aalVarD.d = anpk.c("com.google.assistant.appactions.service.proto.AppActionsService", "StartUpSession");
                    aalVarD.b();
                    defpackage.ahvk ahvkVar = defpackage.ahvk.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(ahvkVar);
                    aalVarD.c = new aohc(defpackage.ahvl.a);
                    anpkVarA = aalVarD.a();
                    c = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static android.view.View i(al alVar) {
        android.view.View view = ((aw) alVar).Q;
        if (view != null) {
            return view;
        }
        android.app.Dialog dialog = alVar.d;
        if (dialog != null) {
            return dialog.findViewById(android.R.id.content);
        }
        return null;
    }

    public static void j(al alVar) {
        android.view.View viewI;
        k(alVar);
        android.view.View viewI2 = i(alVar);
        al alVar2 = ((aw) alVar).E;
        if (alVar2 == null) {
            viewI = alVar.G().findViewById(android.R.id.content);
        } else {
            viewI = alVar2 instanceof al ? i(alVar2) : ((aw) alVar2).Q;
        }
        ahvr.ci(viewI2);
        viewI2.setTag(2131429277, viewI);
    }

    public static void k(al alVar) {
        if (alVar.c && i(alVar) == null) {
            throw new java.lang.IllegalStateException("DialogFragment is being used as a dialog. Must return a valid view in onCreateView() or a valid Dialog in onCreateDialog().");
        }
        if (!alVar.c && ((aw) alVar).Q == null) {
            throw new java.lang.IllegalStateException("DialogFragment not being used as a dialog. Must return a valid view in onCreateView() -- onCreateDialog() is not called.");
        }
    }

    public static int l(java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3, int[] iArr, java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        int iBz = ahvr.bz(obj);
        int i2 = iBz & i;
        int iM = m(obj3, i2);
        if (iM == 0) {
            return -1;
        }
        int i3 = ~i;
        int i4 = iBz & i3;
        int i5 = -1;
        while (true) {
            int i6 = iM - 1;
            int i7 = iArr[i6];
            int i8 = i7 & i;
            if ((i7 & i3) == i4 && j$.util.Objects.equals(obj, objArr[i6]) && (objArr2 == null || j$.util.Objects.equals(obj2, objArr2[i6]))) {
                if (i5 == -1) {
                    q(obj3, i2, i8);
                } else {
                    iArr[i5] = (iArr[i5] & i3) | (i8 & i);
                }
                return i6;
            }
            if (i8 == 0) {
                return -1;
            }
            i5 = i6;
            iM = i8;
        }
    }

    public static int m(java.lang.Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static int n(int i) {
        return java.lang.Math.max(4, ahvr.bA(i + 1));
    }

    public static java.lang.Object o(int i) {
        if (i < 2 || i > 1073741824 || java.lang.Integer.highestOneBit(i) != i) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static void p(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            java.util.Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            java.util.Arrays.fill((short[]) obj, (short) 0);
        } else {
            java.util.Arrays.fill((int[]) obj, 0);
        }
    }

    public static void q(java.lang.Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static boolean r(java.util.Collection collection, java.lang.Object obj) {
        ahvr.ci(collection);
        try {
            return collection.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public static ahyp s(ahyp ahypVar, ahyp ahypVar2) {
        ahvr.ci(ahypVar);
        return new defpackage.ahyq(java.util.Arrays.asList(ahypVar, ahypVar2));
    }

    public static ajcq t(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, ajcu ajcuVar) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit);
        long jConvert = java.util.concurrent.TimeUnit.MILLISECONDS.convert(j2, timeUnit);
        ajdd ajddVar = new ajdd();
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        anty.aq(atomicReference, ajcuVar.b(new defpackage.ahws(ajddVar, runnable, atomicReference, ajcuVar, jElapsedRealtime, jConvert), j, timeUnit));
        ajddVar.c(new defpackage.ahts(atomicReference, 3), ajbm.a);
        return ajddVar;
    }

    public static java.lang.String u(android.os.Bundle bundle, java.lang.String str) {
        return bundle.containsKey(str) ? java.lang.String.valueOf(bundle.getInt(str)) : "<not set>";
    }

    public static java.lang.String v(android.os.Bundle bundle, java.lang.String str) {
        return bundle.containsKey(str) ? java.lang.String.valueOf(bundle.getLong(str)) : "<not set>";
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 3 ? 0 : 4;
        }
        return 2;
    }

    public static j$.util.stream.Stream x(j$.util.Optional optional) {
        return optional.isEmpty() ? j$.util.stream.Stream.-CC.empty() : j$.util.stream.Stream.-CC.of(optional.get());
    }

    public static alrx y(alnu alnuVar) {
        int iOrdinal = alnuVar.ordinal();
        if (iOrdinal == 0) {
            return alrx.a;
        }
        if (iOrdinal == 1) {
            return alrx.b;
        }
        if (iOrdinal == 2) {
            return alrx.c;
        }
        if (iOrdinal == 3) {
            return alrx.d;
        }
        if (iOrdinal == 4) {
            return alrx.e;
        }
        if (iOrdinal == 5) {
            return alrx.f;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    public static /* synthetic */ java.util.Map.Entry z(java.lang.Object obj, java.lang.Object obj2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(obj), j$.util.Objects.requireNonNull(obj2));
    }
}
