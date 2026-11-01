package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajef implements ajzs {
    private final /* synthetic */ int $cid;
    private final aenj b;
    private final aihd c;

    public ajef(int i, boolean[] zArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("FetchVcallVerification"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public final aenj a() {
        int i = this.$cid;
        return this.b;
    }

    public final java.util.Set b() {
        switch (this.$cid) {
            case 0:
                aihd aihdVar = this.c;
                return aihdVar.isEmpty() ? defpackage.ajeg.g.i : aihdVar;
            case 1:
                aihd aihdVar2 = this.c;
                return aihdVar2.isEmpty() ? defpackage.ajeg.g.i : aihdVar2;
            case 2:
                aihd aihdVar3 = this.c;
                return aihdVar3.isEmpty() ? defpackage.ajeg.g.i : aihdVar3;
            case 3:
                aihd aihdVar4 = this.c;
                return aihdVar4.isEmpty() ? defpackage.ajeg.g.i : aihdVar4;
            case 4:
                aihd aihdVar5 = this.c;
                return aihdVar5.isEmpty() ? defpackage.ajeg.g.i : aihdVar5;
            case 5:
                aihd aihdVar6 = this.c;
                return aihdVar6.isEmpty() ? defpackage.ajeh.k.m : aihdVar6;
            case 6:
                aihd aihdVar7 = this.c;
                return aihdVar7.isEmpty() ? defpackage.ajeh.k.m : aihdVar7;
            case 7:
                aihd aihdVar8 = this.c;
                return aihdVar8.isEmpty() ? defpackage.ajeh.k.m : aihdVar8;
            case 8:
                aihd aihdVar9 = this.c;
                return aihdVar9.isEmpty() ? defpackage.ajeh.k.m : aihdVar9;
            case 9:
                aihd aihdVar10 = this.c;
                return aihdVar10.isEmpty() ? defpackage.ajeh.k.m : aihdVar10;
            case 10:
                aihd aihdVar11 = this.c;
                return aihdVar11.isEmpty() ? defpackage.ajeh.k.m : aihdVar11;
            case 11:
                aihd aihdVar12 = this.c;
                return aihdVar12.isEmpty() ? defpackage.ajeh.k.m : aihdVar12;
            case 12:
                aihd aihdVar13 = this.c;
                return aihdVar13.isEmpty() ? defpackage.ajeh.k.m : aihdVar13;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aihd aihdVar14 = this.c;
                return aihdVar14.isEmpty() ? defpackage.ajeh.k.m : aihdVar14;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aihd aihdVar15 = this.c;
                return aihdVar15.isEmpty() ? akmg.o.q : aihdVar15;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aihd aihdVar16 = this.c;
                return aihdVar16.isEmpty() ? akmg.o.q : aihdVar16;
            case 16:
                aihd aihdVar17 = this.c;
                return aihdVar17.isEmpty() ? akmg.o.q : aihdVar17;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aihd aihdVar18 = this.c;
                return aihdVar18.isEmpty() ? akmg.o.q : aihdVar18;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aihd aihdVar19 = this.c;
                return aihdVar19.isEmpty() ? akmg.o.q : aihdVar19;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aihd aihdVar20 = this.c;
                return aihdVar20.isEmpty() ? akmg.o.q : aihdVar20;
            default:
                aihd aihdVar21 = this.c;
                return aihdVar21.isEmpty() ? akmg.o.q : aihdVar21;
        }
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        return this.b.a;
    }

    public ajef(int i) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeg.a, new aenj("ReportSpam"));
        this.c = aikn.a;
    }

    public ajef(int i, char[] cArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeg.a, new aenj("AddMessageSpamSignal"));
        this.c = aikn.a;
    }

    public ajef(int i, short[] sArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeg.a, new aenj("GetCallerInfo"));
        this.c = aikn.a;
    }

    public ajef(int i, int[] iArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeg.a, new aenj("GetSpamEmbeddings"));
        this.c = aikn.a;
    }

    public ajef(int i, byte[] bArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeg.a, new aenj("GetSpamNumbers"));
        this.c = aikn.a;
    }

    public ajef(int i, float[] fArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("RecordVcallEvent"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, byte[][] bArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("RecordVcallUserConsent"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, char[][] cArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("RecordBvRealTimeMetrics"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, short[][] sArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("FetchBusinessMessagingData"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, int[][] iArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("FetchBusinessData"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, boolean[][] zArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("FetchUserData"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, float[][] fArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("SetupCallDataSession"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, byte[][][] bArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.ajeh.a, new aenj("TerminateCallDataSession"));
        this.c = new aile("https://www.googleapis.com/auth/cloud-platform");
    }

    public ajef(int i, char[][][] cArr) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("GetSearchInterests"));
        this.c = aikn.a;
    }

    public ajef(int i, short[][][] sArr) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("SearchProfilePhotoArt"));
        this.c = aikn.a;
    }

    public ajef(int i, int[][][] iArr) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("ListProfilePhotoArtSearchSuggestions"));
        this.c = aikn.a;
    }

    public ajef(int i, boolean[][][] zArr) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("ListProfilePhotoArtCollectionsByCategory"));
        this.c = aikn.a;
    }

    public ajef(int i, float[][][] fArr) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("GetProfileLimitedProfileUiData"));
        this.c = aikn.a;
    }

    public ajef(int i, byte[] bArr, byte[] bArr2) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("PatchProfileLimitedProfileUiData"));
        this.c = aikn.a;
    }

    public ajef(int i, char[] cArr, byte[] bArr) {
        this.$cid = i;
        this.b = aenj.a(akmg.a, new aenj("GetProfilePhotoState"));
        this.c = aikn.a;
    }
}
