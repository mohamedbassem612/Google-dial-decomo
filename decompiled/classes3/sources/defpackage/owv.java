package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class owv implements iou, aood {
    private final /* synthetic */ int $cid;
    public static final defpackage.owv d = new defpackage.owv(3);
    public static final defpackage.owv c = new defpackage.owv(2);
    public static final defpackage.owv b = new defpackage.owv(1);
    public static final defpackage.owv a = new defpackage.owv(0);

    public owv(int i) {
        this.$cid = i;
    }

    public final void a(ipc ipcVar) {
        int i = this.$cid;
        if (i == 0) {
            akzx akzxVar = (akzx) ipcVar.a;
            akzxVar.u();
            ipb ipbVar = akzxVar.b;
            ipb ipbVar2 = ipb.a;
            ipbVar.m = null;
            ipbVar.b &= -1025;
            return;
        }
        if (i == 1) {
            akzx akzxVar2 = (akzx) ipcVar.a;
            akzxVar2.u();
            ipb ipbVar3 = akzxVar2.b;
            ipb ipbVar4 = ipb.a;
            ipbVar3.c = null;
            ipbVar3.b &= -2;
            return;
        }
        if (i != 2) {
            akzx akzxVar3 = (akzx) ipcVar.a;
            akzxVar3.u();
            ipb ipbVar5 = akzxVar3.b;
            ipb ipbVar6 = ipb.a;
            ipbVar5.e = null;
            ipbVar5.b &= -5;
            return;
        }
        akzx akzxVar4 = (akzx) ipcVar.a;
        akzxVar4.u();
        ipb ipbVar7 = akzxVar4.b;
        ipb ipbVar8 = ipb.a;
        ipbVar7.n = null;
        ipbVar7.b &= -4097;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            if ((obj instanceof iou) && (obj instanceof aood)) {
                return aooh.n(new aoof(1, ipc.class, "clearAnswerMethodSettingsData", "clearAnswerMethodSettingsData()V", 0), ((aood) obj).ex());
            }
            return false;
        }
        if (i == 1) {
            if ((obj instanceof iou) && (obj instanceof aood)) {
                return aooh.n(new aoof(1, ipc.class, "clearBackupMetadata", "clearBackupMetadata()V", 0), ((aood) obj).ex());
            }
            return false;
        }
        if (i != 2) {
            if ((obj instanceof iou) && (obj instanceof aood)) {
                return aooh.n(new aoof(1, ipc.class, "clearClientSpamTable", "clearClientSpamTable()V", 0), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof iou) && (obj instanceof aood)) {
            return aooh.n(new aoof(1, ipc.class, "clearCallingCardSettings", "clearCallingCardSettings()V", 0), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        int i = this.$cid;
        if (i == 0) {
            return new aoof(1, ipc.class, "clearAnswerMethodSettingsData", "clearAnswerMethodSettingsData()V", 0);
        }
        if (i != 1) {
            return i != 2 ? new aoof(1, ipc.class, "clearClientSpamTable", "clearClientSpamTable()V", 0) : new aoof(1, ipc.class, "clearCallingCardSettings", "clearCallingCardSettings()V", 0);
        }
        return new aoof(1, ipc.class, "clearBackupMetadata", "clearBackupMetadata()V", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        if (i == 0) {
            return new aoof(1, ipc.class, "clearAnswerMethodSettingsData", "clearAnswerMethodSettingsData()V", 0).hashCode();
        }
        if (i != 1) {
            return i != 2 ? new aoof(1, ipc.class, "clearClientSpamTable", "clearClientSpamTable()V", 0).hashCode() : new aoof(1, ipc.class, "clearCallingCardSettings", "clearCallingCardSettings()V", 0).hashCode();
        }
        return new aoof(1, ipc.class, "clearBackupMetadata", "clearBackupMetadata()V", 0).hashCode();
    }
}
