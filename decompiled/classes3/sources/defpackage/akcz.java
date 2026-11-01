package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akcz implements aoin {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ aoin b;
    final /* synthetic */ aoin c;
    private defpackage.akcw d;

    public akcz(defpackage.akdb akdbVar, android.content.Context context, aoin aoinVar, aoin aoinVar2) {
        this.a = context;
        this.b = aoinVar;
        this.c = aoinVar2;
        j$.util.Objects.requireNonNull(akdbVar);
        this.d = null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [akcr, java.lang.Object] */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final defpackage.akcw a() {
        defpackage.akcw akcwVar = this.d;
        if (akcwVar != null) {
            return akcwVar;
        }
        defpackage.akcw akcwVar2 = new defpackage.akcw(this.a.getPackageName(), (java.lang.String) this.b.a(), this.c.a().e());
        this.d = akcwVar2;
        return akcwVar2;
    }
}
