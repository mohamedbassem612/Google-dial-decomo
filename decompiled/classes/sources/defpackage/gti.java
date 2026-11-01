package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gti extends defpackage.ghg {
    public static final defpackage.gti c = new defpackage.gti();

    private gti() {
        super(12, 13);
    }

    @Override // defpackage.ghg
    public final void a(defpackage.gip gipVar) {
        gipVar.j("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gipVar.j("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
