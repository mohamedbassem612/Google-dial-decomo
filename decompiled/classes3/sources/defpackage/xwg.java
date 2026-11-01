package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwg {
    public final defpackage.ydf a;
    public final dxz b;
    private final java.lang.Class c;
    private final java.util.List d;
    private final java.lang.String e;

    public xwg(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, defpackage.ydf ydfVar, dxz dxzVar) {
        this.c = cls;
        this.d = list;
        this.a = ydfVar;
        this.b = dxzVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + '}';
    }

    public final defpackage.xxe a(defpackage.xvd xvdVar, int i, int i2, defpackage.xus xusVar, java.util.List list) throws defpackage.xxa {
        java.util.List list2 = this.d;
        int size = list2.size();
        defpackage.xxe xxeVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.xuu xuuVar = (defpackage.xuu) list2.get(i3);
            try {
                if (xuuVar.b(xvdVar.a(), xusVar)) {
                    xxeVarA = xuuVar.a(xvdVar.a(), i, i2, xusVar);
                }
            } catch (java.io.IOException | java.lang.OutOfMemoryError | java.lang.RuntimeException e) {
                if (android.util.Log.isLoggable("DecodePath", 2)) {
                    android.util.Log.v("DecodePath", "Failed to decode data for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(xuuVar))), e);
                }
                list.add(e);
            }
            if (xxeVarA != null) {
                break;
            }
        }
        if (xxeVarA != null) {
            return xxeVarA;
        }
        throw new defpackage.xxa(this.e, new java.util.ArrayList(list));
    }

    public final java.lang.String toString() {
        defpackage.ydf ydfVar = this.a;
        java.util.List list = this.d;
        return "DecodePath{ dataClass=" + java.lang.String.valueOf(this.c) + ", decoders=" + java.lang.String.valueOf(list) + ", transcoder=" + ydfVar.toString() + '}';
    }
}
