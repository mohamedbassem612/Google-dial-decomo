package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wit {
    public final java.util.concurrent.Executor a;
    public final aoin b;
    public final java.util.LinkedHashMap c = new java.util.LinkedHashMap();
    public j$.util.Optional d = j$.util.Optional.empty();
    private final defpackage.whs e;
    private final java.lang.String f;

    public wit(ajct ajctVar, defpackage.whs whsVar, java.lang.String str, aoin aoinVar) {
        this.a = new ajdc(ajctVar);
        this.e = whsVar;
        this.f = str;
        this.b = aoinVar;
    }

    public final void a(int i) {
        this.e.b(this.f, i);
    }
}
