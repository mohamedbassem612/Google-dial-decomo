package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yiw {
    public static final /* synthetic */ int e = 0;
    public defpackage.yhx a = null;
    public final float b = 96.0f;
    public final defpackage.ygn c = new defpackage.ygn();
    final java.util.Map d = new java.util.HashMap();

    static {
        new defpackage.xfh();
    }

    protected yiw() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final defpackage.yid c(defpackage.yib yibVar, java.lang.String str) {
        defpackage.yid yidVarC;
        defpackage.yid yidVar = (defpackage.yid) yibVar;
        if (str.equals(yidVar.o)) {
            return yidVar;
        }
        for (java.lang.Object obj : yibVar.n()) {
            if (obj instanceof defpackage.yid) {
                defpackage.yid yidVar2 = (defpackage.yid) obj;
                if (str.equals(yidVar2.o)) {
                    return yidVar2;
                }
                if ((obj instanceof defpackage.yib) && (yidVarC = c((defpackage.yib) obj, str)) != null) {
                    return yidVarC;
                }
            }
        }
        return null;
    }

    protected final defpackage.yif a(java.lang.String str) {
        java.lang.String strSubstring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (strSubstring = str.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        defpackage.yhx yhxVar = this.a;
        if (strSubstring.equals(yhxVar.o)) {
            return yhxVar;
        }
        java.util.Map map = this.d;
        if (map.containsKey(strSubstring)) {
            return (defpackage.yif) map.get(strSubstring);
        }
        defpackage.yid yidVarC = c(this.a, strSubstring);
        map.put(strSubstring, yidVarC);
        return yidVarC;
    }

    public final android.graphics.Picture b(int i, int i2) {
        android.graphics.Picture picture = new android.graphics.Picture();
        defpackage.yjh yjhVar = new defpackage.yjh(picture.beginRecording(i, i2), new defpackage.ygv(0.0f, 0.0f, i, i2));
        yjhVar.c = this;
        defpackage.yhx yhxVar = this.a;
        if (yhxVar == null) {
            defpackage.yjh.h("Nothing to render. Document is empty.", new java.lang.Object[0]);
        } else {
            yjhVar.d = new defpackage.yjd(yjhVar);
            yjhVar.e = new java.util.Stack();
            yjhVar.g(yjhVar.d, defpackage.yhw.a());
            defpackage.yjd yjdVar = yjhVar.d;
            yjdVar.f = yjhVar.b;
            yjdVar.h = false;
            yjdVar.i = false;
            yjhVar.e.push(yjdVar.clone());
            new java.util.Stack();
            new java.util.Stack();
            yjhVar.g = new java.util.Stack();
            yjhVar.f = new java.util.Stack();
            yjhVar.d(yhxVar);
            yjhVar.f(yhxVar, yhxVar.c, yhxVar.d, yhxVar.w, yhxVar.v);
        }
        picture.endRecording();
        return picture;
    }
}
