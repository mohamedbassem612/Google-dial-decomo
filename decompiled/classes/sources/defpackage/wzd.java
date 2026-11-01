package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wzd {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/incallui/atlas/ui/impl/database/SafeAtlasDao");
    public final defpackage.aoin b;
    public final defpackage.ajct c;
    public final defpackage.ajwr d = new defpackage.ajwr();

    public wzd(defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.c = ajctVar;
        this.b = aoinVar;
    }

    public static defpackage.aihd b(xac xacVar) {
        if (xacVar == null) {
            return defpackage.aikn.a;
        }
        defpackage.aihb aihbVar = new defpackage.aihb();
        j$.lang.Iterable.-EL.forEach(xacVar.d, new who(aihbVar, 11));
        return aihbVar.g();
    }

    public static void j(defpackage.aihd aihdVar) {
        defpackage.ailj it = aihdVar.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((wzw) it.next()).c;
            if (!str.isEmpty()) {
                java.io.File file = new java.io.File(str);
                if (!file.exists()) {
                    ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "deleteAudioFiles", 532, "SafeAtlasDao.java")).y("file %s doesn't exist", file.getName());
                } else if (!file.delete()) {
                    defpackage.ainm ainmVarD = a.d();
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarD).i(defpackage.zct.b)).l("com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "deleteAudioFiles", (char) 537, "SafeAtlasDao.java")).y("Unable to delete file %s", file.getName());
                }
            }
        }
    }

    public final defpackage.aify a(defpackage.aify aifyVar) {
        defpackage.aift aiftVar = new defpackage.aift(4);
        j$.lang.Iterable.-EL.forEach(defpackage.ahvr.aQ(aifyVar), new rh(this, aiftVar, 19));
        return aiftVar.g();
    }

    public final defpackage.ajcq c(defpackage.aify aifyVar) {
        return defpackage.ahvr.B(this.d.d(defpackage.ahqx.i(new wzc(this, aifyVar, 0)), this.c), java.lang.Throwable.class, new wro(13), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq d(defpackage.aify aifyVar) {
        return defpackage.ahvr.B(this.d.d(defpackage.ahqx.i(new wzc(this, aifyVar, 2)), this.c), java.lang.Throwable.class, new wro(18), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq e(long j) {
        return defpackage.ahvr.B(this.d.d(defpackage.ahqx.i(new jww(this, j, 19)), this.c), java.lang.Throwable.class, new wro(16), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq f(long j) {
        return defpackage.ahvr.B(this.d.d(defpackage.ahqx.i(new jww(this, j, 18)), this.c), java.lang.Throwable.class, new wro(15), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq g(long j, wxp wxpVar) {
        return defpackage.ahvr.B(this.d.d(defpackage.ahqx.i(new vgq(this, j, wxpVar, 5)), this.c), java.lang.Throwable.class, new wro(17), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq h(long j, xac xacVar) {
        return defpackage.ahvr.B(this.d.d(defpackage.ahqx.i(new vgq(this, j, xacVar, 4)), this.c), java.lang.Throwable.class, new wro(14), defpackage.ajbm.INSTANCE);
    }

    public final j$.util.Optional i(long j) {
        return j$.util.Optional.ofNullable((wyz) defpackage.dez.m((defpackage.gfy) ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) this.b.a()).x().a, true, false, new bpd(j, 8)));
    }

    public final void k(wyz wyzVar) {
        if (wyzVar.a() > 2097152) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "insert", (char) 478, "SafeAtlasDao.java")).v("abort insertion as data size exceeds CursorWindow limit");
            j(b(wyzVar.d));
        } else {
            wyw wywVarX = ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) this.b.a()).x();
            defpackage.dez.m((defpackage.gfy) wywVarX.a, false, true, new defpackage.uph(wywVarX, wyzVar, 5, null));
        }
    }
}
