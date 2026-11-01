package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nnd implements defpackage.iou, defpackage.aood {
    private final /* synthetic */ int $cid;
    public static final defpackage.nnd c = new defpackage.nnd(2);
    public static final defpackage.nnd b = new defpackage.nnd(1);
    public static final defpackage.nnd a = new defpackage.nnd(0);

    public nnd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.iou
    public final void a(defpackage.ipc ipcVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.akzx akzxVar = (defpackage.akzx) ipcVar.a;
            akzxVar.u();
            defpackage.ipb ipbVar = (defpackage.ipb) akzxVar.b;
            defpackage.ipb ipbVar2 = defpackage.ipb.a;
            ipbVar.d = null;
            ipbVar.b &= -3;
            return;
        }
        if (i != 1) {
            defpackage.akzx akzxVar2 = (defpackage.akzx) ipcVar.a;
            akzxVar2.u();
            defpackage.ipb ipbVar3 = (defpackage.ipb) akzxVar2.b;
            defpackage.ipb ipbVar4 = defpackage.ipb.a;
            ipbVar3.k = null;
            ipbVar3.b &= -257;
            return;
        }
        defpackage.akzx akzxVar3 = (defpackage.akzx) ipcVar.a;
        akzxVar3.u();
        defpackage.ipb ipbVar5 = (defpackage.ipb) akzxVar3.b;
        defpackage.ipb ipbVar6 = defpackage.ipb.a;
        ipbVar5.l = null;
        ipbVar5.b &= -513;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if ((obj instanceof defpackage.iou) && (obj instanceof defpackage.aood)) {
                return defpackage.aooh.n(new defpackage.aoof(1, defpackage.ipc.class, "clearDobbySettingsData", "clearDobbySettingsData()V", 0), ((defpackage.aood) obj).ex());
            }
            return false;
        }
        if (i != 1) {
            if ((obj instanceof defpackage.iou) && (obj instanceof defpackage.aood)) {
                return defpackage.aooh.n(new defpackage.aoof(1, defpackage.ipc.class, "clearSharpieSettingsData", "clearSharpieSettingsData()V", 0), ((defpackage.aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof defpackage.iou) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(new defpackage.aoof(1, defpackage.ipc.class, "clearBeeslySettingsData", "clearBeeslySettingsData()V", 0), ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.aoof(1, defpackage.ipc.class, "clearSharpieSettingsData", "clearSharpieSettingsData()V", 0) : new defpackage.aoof(1, defpackage.ipc.class, "clearBeeslySettingsData", "clearBeeslySettingsData()V", 0);
        }
        return new defpackage.aoof(1, defpackage.ipc.class, "clearDobbySettingsData", "clearDobbySettingsData()V", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new defpackage.aoof(1, defpackage.ipc.class, "clearSharpieSettingsData", "clearSharpieSettingsData()V", 0).hashCode() : new defpackage.aoof(1, defpackage.ipc.class, "clearBeeslySettingsData", "clearBeeslySettingsData()V", 0).hashCode();
        }
        return new defpackage.aoof(1, defpackage.ipc.class, "clearDobbySettingsData", "clearDobbySettingsData()V", 0).hashCode();
    }
}
