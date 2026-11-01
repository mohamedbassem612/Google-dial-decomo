package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akmf implements ajzs {
    private final /* synthetic */ int $cid;
    private final aenj b;
    private final aihd c;

    public akmf(int i, float[] fArr) {
        this.$cid = i;
        this.b = aenj.a(aknt.a, new aenj("RemixCallingCardBackdrop"));
        this.c = aihd.r("https://www.googleapis.com/auth/userinfo.email", "https://www.googleapis.com/auth/peopleapi.readonly");
    }

    public final aenj a() {
        int i = this.$cid;
        if (i == 0 || i == 1 || i == 2 || i != 3) {
        }
        return this.b;
    }

    public final java.util.Set b() {
        int i = this.$cid;
        if (i == 0) {
            aihd aihdVar = this.c;
            return aihdVar.isEmpty() ? defpackage.akmg.o.q : aihdVar;
        }
        if (i == 1) {
            aihd aihdVar2 = this.c;
            return aihdVar2.isEmpty() ? defpackage.akmg.o.q : aihdVar2;
        }
        if (i == 2) {
            aihd aihdVar3 = this.c;
            return aihdVar3.isEmpty() ? defpackage.akmg.o.q : aihdVar3;
        }
        if (i == 3) {
            aihd aihdVar4 = this.c;
            return aihdVar4.isEmpty() ? defpackage.akmg.o.q : aihdVar4;
        }
        if (i == 4) {
            aihd aihdVar5 = this.c;
            return aihdVar5.isEmpty() ? defpackage.akmg.o.q : aihdVar5;
        }
        aihd aihdVar6 = this.c;
        if (i != 5) {
            return aihdVar6.isEmpty() ? aknt.j.l : aihdVar6;
        }
        return aihdVar6.isEmpty() ? defpackage.akmg.o.q : aihdVar6;
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        return ((i == 0 || i == 1 || i == 2 || i == 3 || i != 4) ? this.b : this.b).a;
    }

    public akmf(int i) {
        this.$cid = i;
        this.b = aenj.a(defpackage.akmg.a, new aenj("ListProfilePhotosClusterSuggestions"));
        this.c = aikn.a;
    }

    public akmf(int i, char[] cArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.akmg.a, new aenj("ListArchivedProfilePhotos"));
        this.c = aikn.a;
    }

    public akmf(int i, short[] sArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.akmg.a, new aenj("GetProfilePhotoArtCollectionImages"));
        this.c = aikn.a;
    }

    public akmf(int i, int[] iArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.akmg.a, new aenj("GetProfilePhotoArtFullImage"));
        this.c = aikn.a;
    }

    public akmf(int i, boolean[] zArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.akmg.a, new aenj("GetProfilePhotoArtHomeSuggestions"));
        this.c = aikn.a;
    }

    public akmf(int i, byte[] bArr) {
        this.$cid = i;
        this.b = aenj.a(defpackage.akmg.a, new aenj("ListProfilePhotosPhotoSuggestions"));
        this.c = aikn.a;
    }
}
