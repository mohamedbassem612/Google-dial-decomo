package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dme extends dwj {
    final /* synthetic */ aosb a;
    final /* synthetic */ dnh b;

    public dme(aosb aosbVar, dnh dnhVar) {
        this.a = aosbVar;
        this.b = dnhVar;
    }

    public final void a(int i) {
        this.a.g(new java.lang.IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    public final void b(android.graphics.Typeface typeface) {
        this.a.w(typeface);
    }
}
