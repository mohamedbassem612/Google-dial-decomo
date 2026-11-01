package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tjp implements defpackage.tjh {
    private final rlv a;
    private final defpackage.tjh b;
    private final aify c;

    public tjp(rlv rlvVar, defpackage.tjh tjhVar, java.util.List list) {
        this.b = tjhVar;
        this.a = rlvVar;
        this.c = aify.n(list);
    }

    @Override // defpackage.tjh
    public final void a() {
        this.b.a();
        rlv rlvVar = this.a;
        j$.util.Objects.requireNonNull(rlvVar);
        j$.lang.Iterable.-EL.forEach(this.c, new defpackage.oxs(rlvVar, 15));
    }
}
