package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akmg implements ajzt {
    public final aify p;
    public final aihd q;
    private final aigf t;
    public static final aenj a = new aenj("google.internal.contactsui.v1.CustardService.");
    private static final aenj r = new aenj("google.internal.contactsui.v1.CustardService/");
    public static final ajzs b = new ajef(18, (float[][][]) null);
    public static final ajzs c = new ajef(19, (byte[]) null, (byte[]) null);
    public static final ajzs d = new ajef(20, (char[]) null, (byte[]) null);
    public static final ajzs e = new defpackage.akmf(1, (byte[]) null);
    public static final ajzs f = new defpackage.akmf(0);
    public static final ajzs g = new defpackage.akmf(2, (char[]) null);
    public static final ajzs h = new defpackage.akmf(3, (short[]) null);
    public static final ajzs i = new defpackage.akmf(4, (int[]) null);
    public static final ajzs j = new defpackage.akmf(5, (boolean[]) null);
    public static final ajzs k = new ajef(14, (char[][][]) null);
    public static final ajzs l = new ajef(15, (short[][][]) null);
    public static final ajzs m = new ajef(16, (int[][][]) null);
    public static final ajzs n = new ajef(17, (boolean[][][]) null);
    public static final defpackage.akmg o = new defpackage.akmg();
    private static final aenj s = new aenj("contactsui-pa.googleapis.com");

    private akmg() {
        aift aiftVar = new aift(4);
        aiftVar.i("autopush-contactsui-pa.sandbox.googleapis.com");
        aiftVar.i("staging-contactsui-pa.sandbox.googleapis.com");
        aiftVar.i("contactsui-pa.googleapis.com");
        this.p = aiftVar.h();
        aihb aihbVar = new aihb();
        aihbVar.i("https://www.googleapis.com/auth/peopleapi.readonly");
        aihbVar.i("https://www.googleapis.com/auth/peopleapi.readwrite");
        aihbVar.i("https://www.googleapis.com/auth/plus.peopleapi.readwrite");
        this.q = aihbVar.h();
        ajzs ajzsVar = b;
        ajzs ajzsVar2 = c;
        ajzs ajzsVar3 = d;
        ajzs ajzsVar4 = e;
        ajzs ajzsVar5 = f;
        ajzs ajzsVar6 = g;
        ajzs ajzsVar7 = h;
        ajzs ajzsVar8 = i;
        ajzs ajzsVar9 = j;
        ajzs ajzsVar10 = k;
        ajzs ajzsVar11 = l;
        ajzs ajzsVar12 = m;
        ajzs ajzsVar13 = n;
        aihd.v(ajzsVar, ajzsVar2, ajzsVar3, ajzsVar4, ajzsVar5, ajzsVar6, new ajzs[]{ajzsVar7, ajzsVar8, ajzsVar9, ajzsVar10, ajzsVar11, ajzsVar12, ajzsVar13});
        aigb aigbVar = new aigb(4);
        aigbVar.i("GetProfileLimitedProfileUiData", ajzsVar);
        aigbVar.i("PatchProfileLimitedProfileUiData", ajzsVar2);
        aigbVar.i("GetProfilePhotoState", ajzsVar3);
        aigbVar.i("ListProfilePhotosPhotoSuggestions", ajzsVar4);
        aigbVar.i("ListProfilePhotosClusterSuggestions", ajzsVar5);
        aigbVar.i("ListArchivedProfilePhotos", ajzsVar6);
        aigbVar.i("GetProfilePhotoArtCollectionImages", ajzsVar7);
        aigbVar.i("GetProfilePhotoArtFullImage", ajzsVar8);
        aigbVar.i("GetProfilePhotoArtHomeSuggestions", ajzsVar9);
        aigbVar.i("GetSearchInterests", ajzsVar10);
        aigbVar.i("SearchProfilePhotoArt", ajzsVar11);
        aigbVar.i("ListProfilePhotoArtSearchSuggestions", ajzsVar12);
        aigbVar.i("ListProfilePhotoArtCollectionsByCategory", ajzsVar13);
        this.t = aigbVar.e(true);
        new aigb(4).e(true);
    }

    public final aenj a() {
        return s;
    }

    public final ajzs b(java.lang.String str) {
        java.lang.String str2 = r.a;
        if (str.startsWith(str2)) {
            java.lang.String strSubstring = str.substring(str2.length());
            aigf aigfVar = this.t;
            if (aigfVar.containsKey(strSubstring)) {
                return (ajzs) aigfVar.get(strSubstring);
            }
        }
        return null;
    }
}
