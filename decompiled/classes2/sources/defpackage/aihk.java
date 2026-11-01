package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihk extends defpackage.aige {
    private static final long serialVersionUID = 0;
    private final java.util.Comparator a;

    public aihk(defpackage.aihl aihlVar) {
        super(aihlVar);
        this.a = aihlVar.comparator();
    }

    @Override // defpackage.aige
    public final /* bridge */ /* synthetic */ aigb a(int i) {
        return new defpackage.aihh(this.a);
    }
}
