package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahul extends anrt {
    private final anrt a;
    private final anrt b;

    public ahul(android.content.Context context) {
        this.b = new defpackage.akap(aaco.a(context));
        int i = anrs.a;
        this.a = new anrr();
    }

    public final anqw a(int i) {
        return (this.a.a(i).h() || this.b.a(i).h()) ? anqw.b : anqw.f.f("Rejected by server security policy because incoming client is not self or Google signed.");
    }
}
