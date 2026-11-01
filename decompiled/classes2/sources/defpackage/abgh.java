package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abgh extends crb {
    final /* synthetic */ long a;
    final /* synthetic */ java.util.List b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ long e;

    public abgh(long j, java.util.List list, float f, boolean z, long j2) {
        this.a = j;
        this.b = list;
        this.c = f;
        this.d = z;
        this.e = j2;
    }

    public final android.graphics.Shader b(long j) {
        char c;
        android.graphics.Shader shaderC;
        char c2 = ' ';
        int i = (int) (j >> 32);
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i));
        long j2 = this.a;
        android.graphics.Shader shaderC2 = defpackage.cpy.c(0L, jFloatToRawIntBits << 32, ajsz.bb(new cqg[]{new cqg(j2), new cqg(j2)}), null, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.abhb abhbVar : this.b) {
            if (abhbVar.a() == 0.0f) {
                shaderC = null;
                c = c2;
            } else {
                boolean z = this.d;
                float f = this.c;
                float f2 = 1.25f * f;
                float f3 = f + f2;
                float fB = z ? f - (f3 * abhbVar.b()) : ((-f2) - (f - java.lang.Float.intBitsToFloat(i))) + (f3 * abhbVar.b());
                long jH = cqg.h(this.e, abhbVar.a());
                c = c2;
                shaderC = defpackage.cpy.c(((long) java.lang.Float.floatToRawIntBits(fB)) << c, ((long) java.lang.Float.floatToRawIntBits(fB + f2)) << c, ajsz.bb(new cqg[]{new cqg(cfd.M(0)), new cqg(jH), new cqg(jH), new cqg(cfd.M(0))}), ajsz.bb(new java.lang.Float[]{java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.25f), java.lang.Float.valueOf(0.75f), java.lang.Float.valueOf(1.0f)}), 0);
            }
            if (shaderC != null) {
                arrayList.add(shaderC);
            }
            c2 = c;
            i = i;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            shaderC2 = new android.graphics.ComposeShader(shaderC2, (android.graphics.Shader) it.next(), rz.i(9));
        }
        return shaderC2;
    }
}
