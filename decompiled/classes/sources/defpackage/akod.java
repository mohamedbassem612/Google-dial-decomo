package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class akod implements defpackage.ajzs {
    private final /* synthetic */ int $cid;
    private final defpackage.aenj b;
    private final defpackage.aihd c;

    public akod(int i, byte[] bArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("StartVerification"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    @Override // defpackage.ajzs
    public final defpackage.aenj a() {
        if (this.$cid != 0) {
        }
        return this.b;
    }

    @Override // defpackage.ajzs
    public final java.util.Set b() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aihd aihdVar = this.c;
            return aihdVar.isEmpty() ? defpackage.akoe.O.Q : aihdVar;
        }
        if (i == 1) {
            defpackage.aihd aihdVar2 = this.c;
            return aihdVar2.isEmpty() ? defpackage.akoe.O.Q : aihdVar2;
        }
        defpackage.aihd aihdVar3 = this.c;
        if (i != 2) {
            return aihdVar3.isEmpty() ? defpackage.akoe.O.Q : aihdVar3;
        }
        return aihdVar3.isEmpty() ? defpackage.akoe.O.Q : aihdVar3;
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        return ((i == 0 || i != 1) ? this.b : this.b).a;
    }

    public akod(int i) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("FinishVerification"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akod(int i, char[] cArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("AnonymousStartVerification"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akod(int i, short[] sArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("AnonymousFinishVerification"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }
}
