package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class crb extends defpackage.cqd {
    private long a = 9205357640488583168L;
    private yz b;

    @Override // defpackage.cqd
    public final void a(long j, defpackage.cpv cpvVar, float f) {
        yz yzVar = this.b;
        if (yzVar == null || this.a != j) {
            if (defpackage.cpp.d(j)) {
                this.b = null;
                this.a = 9205357640488583168L;
                yzVar = null;
            } else {
                yzVar = this.b;
                if (yzVar == null) {
                    yzVar = new yz();
                    this.b = yzVar;
                }
                yzVar.a = b(j);
                this.b = yzVar;
                this.a = j;
            }
        }
        if (cpvVar.g() != -72057594037927936L) {
            cpvVar.j(-72057594037927936L);
        }
        if (!defpackage.aooh.n(cpvVar.c, yzVar != null ? yzVar.a : null)) {
            cpvVar.m((android.graphics.Shader) (yzVar != null ? yzVar.a : null));
        }
        if (cpvVar.a() != f) {
            cpvVar.h(f);
        }
    }

    public abstract android.graphics.Shader b(long j);
}
