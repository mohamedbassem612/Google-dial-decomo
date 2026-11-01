package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class akoc implements defpackage.ajzs {
    private final /* synthetic */ int $cid;
    private final defpackage.aenj b;
    private final defpackage.aihd c;

    public akoc(int i, byte[] bArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("ListDevicePhoneNumbers"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    @Override // defpackage.ajzs
    public final defpackage.aenj a() {
        int i = this.$cid;
        return this.b;
    }

    @Override // defpackage.ajzs
    public final java.util.Set b() {
        switch (this.$cid) {
            case 0:
                defpackage.aihd aihdVar = this.c;
                return aihdVar.isEmpty() ? defpackage.akoe.O.Q : aihdVar;
            case 1:
                defpackage.aihd aihdVar2 = this.c;
                return aihdVar2.isEmpty() ? defpackage.akoe.O.Q : aihdVar2;
            case 2:
                defpackage.aihd aihdVar3 = this.c;
                return aihdVar3.isEmpty() ? defpackage.akoe.O.Q : aihdVar3;
            case 3:
                defpackage.aihd aihdVar4 = this.c;
                return aihdVar4.isEmpty() ? defpackage.akoe.O.Q : aihdVar4;
            case 4:
                defpackage.aihd aihdVar5 = this.c;
                return aihdVar5.isEmpty() ? defpackage.akoe.O.Q : aihdVar5;
            case 5:
                defpackage.aihd aihdVar6 = this.c;
                return aihdVar6.isEmpty() ? defpackage.akoe.O.Q : aihdVar6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aihd aihdVar7 = this.c;
                return aihdVar7.isEmpty() ? defpackage.akoe.O.Q : aihdVar7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aihd aihdVar8 = this.c;
                return aihdVar8.isEmpty() ? defpackage.akoe.O.Q : aihdVar8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aihd aihdVar9 = this.c;
                return aihdVar9.isEmpty() ? defpackage.akoe.O.Q : aihdVar9;
            case 9:
                defpackage.aihd aihdVar10 = this.c;
                return aihdVar10.isEmpty() ? defpackage.akoe.O.Q : aihdVar10;
            case 10:
                defpackage.aihd aihdVar11 = this.c;
                return aihdVar11.isEmpty() ? defpackage.akoe.O.Q : aihdVar11;
            case 11:
                defpackage.aihd aihdVar12 = this.c;
                return aihdVar12.isEmpty() ? defpackage.akoe.O.Q : aihdVar12;
            case 12:
                defpackage.aihd aihdVar13 = this.c;
                return aihdVar13.isEmpty() ? defpackage.akoe.O.Q : aihdVar13;
            case 13:
                defpackage.aihd aihdVar14 = this.c;
                return aihdVar14.isEmpty() ? defpackage.akoe.O.Q : aihdVar14;
            case 14:
                defpackage.aihd aihdVar15 = this.c;
                return aihdVar15.isEmpty() ? defpackage.akoe.O.Q : aihdVar15;
            case 15:
                defpackage.aihd aihdVar16 = this.c;
                return aihdVar16.isEmpty() ? defpackage.akoe.O.Q : aihdVar16;
            case 16:
                defpackage.aihd aihdVar17 = this.c;
                return aihdVar17.isEmpty() ? defpackage.akoe.O.Q : aihdVar17;
            case 17:
                defpackage.aihd aihdVar18 = this.c;
                return aihdVar18.isEmpty() ? defpackage.akoe.O.Q : aihdVar18;
            case 18:
                defpackage.aihd aihdVar19 = this.c;
                return aihdVar19.isEmpty() ? defpackage.akoe.O.Q : aihdVar19;
            case 19:
                defpackage.aihd aihdVar20 = this.c;
                return aihdVar20.isEmpty() ? defpackage.akoe.O.Q : aihdVar20;
            default:
                defpackage.aihd aihdVar21 = this.c;
                return aihdVar21.isEmpty() ? defpackage.akoe.O.Q : aihdVar21;
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        return this.b.a;
    }

    public akoc(int i) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("SetAccountManagementPhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, char[] cArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("AddAccountManagementPhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, short[] sArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("DeleteAccountManagementPhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, int[] iArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("ReplaceAccountManagementPhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, boolean[] zArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("SetDeviceConsentPhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, float[] fArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("SetDeviceConsent"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, byte[][] bArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("BatchListPhoneNumbers"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, char[][] cArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("UpdateDeviceConsent"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, short[][] sArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("UpdateDeviceVerification"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, int[][] iArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("SyncDevicePhoneNumbers"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, boolean[][] zArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("WipeoutDevicePhoneNumbers"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, float[][] fArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("ListAppReachability"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, byte[][][] bArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("GetAppReachability"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, char[][][] cArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("UpdateAppReachability"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, short[][][] sArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("HandleDeviceReachabilityData"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, int[][][] iArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("ReadPhoneData"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, boolean[][][] zArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("RenumberPhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, float[][][] fArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("CreatePhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, byte[] bArr, byte[] bArr2) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("DeletePhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }

    public akoc(int i, char[] cArr, byte[] bArr) {
        this.$cid = i;
        this.b = defpackage.aenj.a(defpackage.akoe.a, new defpackage.aenj("UpdatePhoneNumber"));
        this.c = new defpackage.aile("https://www.googleapis.com/auth/myphonenumbers");
    }
}
