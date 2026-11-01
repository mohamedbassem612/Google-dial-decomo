package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class osm implements olu {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;

    public osm(int i) {
        this.$cid = i;
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.otm otmVar = new defpackage.otm((char[]) null);
            otmVar.a = "in_call_account_selector_dialog_shown";
            otmVar.f(java.lang.Boolean.toString(((java.util.concurrent.atomic.AtomicBoolean) this.a).get()));
            return aiql.z(otmVar.e());
        }
        if (i == 1) {
            return ahvr.H(((defpackage.pqo) this.a).b, new onp(1), ajbm.a);
        }
        if (i != 2) {
            defpackage.otm otmVar2 = new defpackage.otm((char[]) null);
            otmVar2.a = "is_dnd_mode_enabled";
            otmVar2.f(java.lang.Boolean.toString(((rwi) this.a).a() != 1));
            return aiql.z(otmVar2.e());
        }
        defpackage.otm otmVar3 = new defpackage.otm((char[]) null);
        otmVar3.a = "international_call_on_wifi_dialog_shown";
        otmVar3.f(java.lang.Boolean.toString(((java.util.concurrent.atomic.AtomicBoolean) this.a).get()));
        return aiql.z(otmVar3.e());
    }

    public osm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public osm(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
