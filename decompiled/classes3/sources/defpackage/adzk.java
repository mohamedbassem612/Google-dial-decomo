package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adzk implements ajcb {
    final /* synthetic */ adzl a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ adzf d;

    public adzk(adzl adzlVar, long j, java.lang.String str, adzf adzfVar) {
        this.a = adzlVar;
        this.b = j;
        this.c = str;
        this.d = adzfVar;
    }

    public final void a(java.lang.Throwable th) {
        aooh.f(th, "t");
        adzl.a.d().k(th).M("Failed to schedule a job for package [%s] with ID: %s, type: %s via WorkManager", this.a.b.getApplicationContext().getPackageName(), this.c, java.lang.Integer.valueOf(this.d.a()));
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        aooh.f((gsn) obj, "result");
        this.d.a();
        this.a.c(this.b);
    }
}
