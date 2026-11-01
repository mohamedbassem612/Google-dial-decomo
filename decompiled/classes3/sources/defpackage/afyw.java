package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afyw extends defpackage.afzb {
    private final android.graphics.Typeface a;
    private boolean b;
    private final defpackage.aprf c;

    public afyw(defpackage.aprf aprfVar, android.graphics.Typeface typeface) {
        this.a = typeface;
        this.c = aprfVar;
    }

    private final void d(android.graphics.Typeface typeface) {
        if (this.b) {
            return;
        }
        defpackage.afua afuaVar = (defpackage.afua) this.c.a;
        if (afuaVar.s(typeface)) {
            afuaVar.i(false);
        }
    }

    @Override // defpackage.afzb
    public final void a(int i) {
        d(this.a);
    }

    @Override // defpackage.afzb
    public final void b(android.graphics.Typeface typeface, boolean z) {
        d(typeface);
    }

    public final void c() {
        this.b = true;
    }
}
