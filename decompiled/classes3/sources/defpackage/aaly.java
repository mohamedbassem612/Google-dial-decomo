package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaly implements defpackage.aafd {
    private final /* synthetic */ int $cid;

    public aaly(defpackage.ylo yloVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(yloVar);
    }

    @Override // defpackage.aafd
    public final /* synthetic */ void a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            return;
        }
        if (i == 3) {
            ((com.google.android.gms.people.contactssync.DeviceContactsSyncClient.SyncSettingUpdatedListener) obj).onDeviceContactsSyncSettingUpdated();
        } else if (i != 4) {
            ((defpackage.aavm) obj).a();
        } else {
            ((defpackage.aaqi) obj).a();
        }
    }

    public aaly(int i) {
        this.$cid = i;
    }

    public aaly(defpackage.zyp zypVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(zypVar);
    }

    public aaly(defpackage.ylo yloVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(yloVar);
    }

    public aaly(defpackage.ylo yloVar, int i, char[] cArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(yloVar);
    }

    public aaly(defpackage.aaqx aaqxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aaqxVar);
    }
}
