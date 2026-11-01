package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class acik implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ acik(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [aomy, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        j$.util.concurrent.ConcurrentHashMap file;
        switch (this.$cid) {
            case 0:
                file = new java.io.File(((android.content.Context) this.a).getFilesDir(), "sync_data.pb");
                break;
            case 1:
                defpackage.abuy abuyVar = defpackage.abva.d;
                int i = abuyVar.a;
                defpackage.abvp abvpVar = (defpackage.abvp) this.a;
                android.content.Context context = abvpVar.b;
                boolean z = false;
                if (abvpVar.e.l(context, i) == 0 && abuyVar.a(abvpVar.a()) && defpackage.abts.h(context)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
            default:
                return this.a;
            case 3:
                file = new java.io.File((java.lang.String) this.a);
                break;
            case 4:
                file = new java.io.File((java.lang.String) this.a);
                break;
            case 5:
                return this.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                file = new j$.util.concurrent.ConcurrentHashMap(((java.util.Map) ((defpackage.ahbz) this.a).b.a()).size(), 0.75f, 4);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ahce ahceVar = (defpackage.ahce) this.a;
                return java.lang.Boolean.valueOf(ahceVar.c.contains(ahceVar.q));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ahce ahceVar2 = (defpackage.ahce) this.a;
                return ahceVar2.f.f.c(ahceVar2.w.t(ahceVar2.g));
            case 9:
                file = defpackage.agab.ap();
                if (file == null || file.length() == 0) {
                    return ((defpackage.aogc) this.a).b;
                }
                break;
            case 10:
                return java.lang.Boolean.valueOf(((defpackage.akan) this.a).a.e());
            case 11:
                defpackage.akcg akcgVar = defpackage.akcg.a;
                java.lang.Object objA = this.a.a();
                defpackage.aooh.e(objA, "get(...)");
                return (aljf) defpackage.aooh.q((j$.util.Optional) objA);
            case 12:
                return this.a.iterator();
            case 13:
                return this.a;
            case 14:
                return defpackage.apit.b(this.a);
        }
        return file;
    }
}
