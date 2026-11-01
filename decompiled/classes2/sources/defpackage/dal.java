package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dal implements defpackage.cow {
    public static final defpackage.dal a = new defpackage.dal();
    public static java.lang.Boolean b;

    @Override // defpackage.cow
    public final void a(boolean z) {
        b = java.lang.Boolean.valueOf(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    @Override // defpackage.cow
    public final boolean e() throws aoiq {
        java.lang.Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        cwh.b("canFocus is read before it is written");
        throw new aoiq();
    }

    @Override // defpackage.cow
    public final /* synthetic */ void b(cpn cpnVar) {
    }

    @Override // defpackage.cow
    public final /* synthetic */ void c(aonj aonjVar) {
    }

    @Override // defpackage.cow
    public final /* synthetic */ void d(aonj aonjVar) {
    }
}
