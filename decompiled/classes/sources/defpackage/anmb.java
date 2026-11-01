package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anmb {
    public static final defpackage.anmb a;
    public final defpackage.anmw b;
    public final java.util.concurrent.Executor c;
    public final java.util.List d;
    public final java.lang.Integer e;
    public final java.lang.Integer f;
    public final defpackage.anar g;
    private final java.lang.Object[][] h;
    private final java.lang.Boolean i;

    static {
        defpackage.anlz anlzVar = new defpackage.anlz();
        anlzVar.c = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, 0, 2);
        anlzVar.d = java.util.Collections.EMPTY_LIST;
        a = new defpackage.anmb(anlzVar);
    }

    public anmb(defpackage.anlz anlzVar) {
        this.b = anlzVar.a;
        this.c = anlzVar.b;
        this.g = anlzVar.h;
        this.h = anlzVar.c;
        this.d = anlzVar.d;
        this.i = anlzVar.e;
        this.e = anlzVar.f;
        this.f = anlzVar.g;
    }

    public static defpackage.anlz a(defpackage.anmb anmbVar) {
        defpackage.anlz anlzVar = new defpackage.anlz();
        anlzVar.a = anmbVar.b;
        anlzVar.b = anmbVar.c;
        anlzVar.h = anmbVar.g;
        anlzVar.c = anmbVar.h;
        anlzVar.d = anmbVar.d;
        anlzVar.e = anmbVar.i;
        anlzVar.f = anmbVar.e;
        anlzVar.g = anmbVar.f;
        return anlzVar;
    }

    public final defpackage.anmb b(defpackage.anmw anmwVar) {
        defpackage.anlz anlzVarA = a(this);
        anlzVarA.a = anmwVar;
        return new defpackage.anmb(anlzVarA);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final defpackage.anmb c(int i) {
        defpackage.ahvr.bP((i ^ (-1)) >>> 31, "invalid maxsize %s", i);
        defpackage.anlz anlzVarA = a(this);
        anlzVarA.f = java.lang.Integer.valueOf(i);
        return new defpackage.anmb(anlzVarA);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final defpackage.anmb d(int i) {
        defpackage.ahvr.bP((i ^ (-1)) >>> 31, "invalid maxsize %s", i);
        defpackage.anlz anlzVarA = a(this);
        anlzVarA.g = java.lang.Integer.valueOf(i);
        return new defpackage.anmb(anlzVarA);
    }

    public final defpackage.anmb e(defpackage.anma anmaVar, java.lang.Object obj) {
        java.lang.Object[][] objArr;
        int length;
        defpackage.ahvr.cj(anmaVar, "key");
        defpackage.ahvr.cj(obj, "value");
        defpackage.anlz anlzVarA = a(this);
        int i = 0;
        while (true) {
            objArr = this.h;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (anmaVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        anlzVarA.c = (java.lang.Object[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Object.class, (i == -1 ? 1 : 0) + length, 2);
        java.lang.System.arraycopy(objArr, 0, anlzVarA.c, 0, length);
        if (i == -1) {
            anlzVarA.c[length] = new java.lang.Object[]{anmaVar, obj};
        } else {
            anlzVarA.c[i] = new java.lang.Object[]{anmaVar, obj};
        }
        return new defpackage.anmb(anlzVarA);
    }

    public final java.lang.Object f(defpackage.anma anmaVar) {
        defpackage.ahvr.cj(anmaVar, "key");
        int i = 0;
        while (true) {
            java.lang.Object[][] objArr = this.h;
            if (i >= objArr.length) {
                return anmaVar.a;
            }
            if (anmaVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean g() {
        return java.lang.Boolean.TRUE.equals(this.i);
    }

    public final defpackage.anmb h(defpackage.anty antyVar) {
        java.util.List list = this.d;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(antyVar);
        defpackage.anlz anlzVarA = a(this);
        anlzVarA.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
        return new defpackage.anmb(anlzVarA);
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("deadline", this.b);
        ahymVarL.b("authority", null);
        ahymVarL.b("callCredentials", this.g);
        java.util.concurrent.Executor executor = this.c;
        ahymVarL.b("executor", executor != null ? executor.getClass() : null);
        ahymVarL.b("compressorName", null);
        ahymVarL.b("customOptions", java.util.Arrays.deepToString(this.h));
        ahymVarL.g("waitForReady", g());
        ahymVarL.b("maxInboundMessageSize", this.e);
        ahymVarL.b("maxOutboundMessageSize", this.f);
        ahymVarL.b("onReadyThreshold", null);
        ahymVarL.b("streamTracerFactories", this.d);
        return ahymVarL.toString();
    }
}
