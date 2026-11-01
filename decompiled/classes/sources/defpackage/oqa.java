package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oqa implements defpackage.ackz {
    private final defpackage.aoin a;
    private final defpackage.aoin b;
    private final defpackage.az c;
    private oqb d;
    private final defpackage.zzx e;
    private final defpackage.ipc f;

    static {
        defpackage.ajsz.bb("open_search_bar_fragment", "search_fragment_tag", "precall_dialpad_dialog");
    }

    public oqa(defpackage.zzx zzxVar, defpackage.ipc ipcVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.az azVar) {
        this.e = zzxVar;
        this.f = ipcVar;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = azVar;
    }

    @Override // defpackage.ackz
    public final defpackage.az a() {
        return this.c;
    }

    @Override // defpackage.ackz
    public final acky b(aclc aclcVar) {
        if (((java.lang.Boolean) this.a.a()).booleanValue()) {
            defpackage.akzm akzmVar = this.f.bd().d;
            if (akzmVar == null) {
                akzmVar = defpackage.akzm.a;
            }
            if (akzmVar.b <= ((java.lang.Number) this.b.a()).longValue()) {
                return new acky(false, 2);
            }
        }
        defpackage.ailj it = this.e.e().iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            oqb oqbVar = (oqb) it.next();
            acky ackyVarA = oqbVar.a(aclcVar);
            if (ackyVarA != null) {
                this.d = oqbVar;
                return ackyVarA;
            }
        }
        this.d = null;
        return new acky(true, 1);
    }

    @Override // defpackage.ackz
    public final void c(aclc aclcVar, ackw ackwVar) {
        oqb oqbVar = this.d;
        if (oqbVar != null) {
            oqbVar.b(aclcVar.b, ackwVar);
        }
    }

    @Override // defpackage.ackz
    public final /* synthetic */ void d(java.lang.String str) {
        defpackage.aooh.f(str, "error");
    }
}
