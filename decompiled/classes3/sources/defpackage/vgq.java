package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vgq implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ vgq(java.lang.Object obj, long j, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        int i = this.$cid;
        defpackage.vtl vtlVar = null;
        if (i != 0) {
            if (i == 1) {
                java.io.File file = new java.io.File(((android.content.Context) ((defpackage.pgi) this.b).a).getCacheDir(), java.lang.String.format(java.util.Locale.US, "call_screen_session_metrics_%d", java.lang.Long.valueOf(this.a)));
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                ((akym) this.c).h(fileOutputStream);
                fileOutputStream.close();
                return j$.util.Optional.of(file.getAbsolutePath());
            }
            if (i == 2) {
                ((defpackage.wvq) this.b).d(this.a, j$.util.Optional.empty(), j$.util.Optional.of(this.c));
                return null;
            }
            if (i != 3) {
                if (i != 4) {
                    java.lang.Object obj = this.c;
                    long j = this.a;
                    wzd wzdVar = (wzd) obj;
                    j$.util.Optional optionalI = wzdVar.i(j);
                    boolean zIsPresent = optionalI.isPresent();
                    java.lang.Object obj2 = this.b;
                    if (!zIsPresent) {
                        defpackage.wyz wyzVar = new defpackage.wyz();
                        wyzVar.a = j;
                        wyzVar.c = (defpackage.wxp) obj2;
                        wyzVar.d = defpackage.xac.a;
                        wyzVar.b = j$.time.Instant.now().toEpochMilli();
                        wzdVar.k(wyzVar);
                        return null;
                    }
                    ahvr.bY(j == ((defpackage.wyz) optionalI.orElseThrow()).a);
                    defpackage.wxp wxpVar = ((defpackage.wyz) optionalI.orElseThrow()).c;
                    if (wxpVar == null) {
                        wxpVar = defpackage.wxp.a;
                    }
                    defpackage.wyz wyzVar2 = (defpackage.wyz) optionalI.orElseThrow();
                    akzx akzxVarP = wxpVar.p();
                    akzxVarP.z((alad) obj2);
                    wyzVar2.c = (defpackage.wxp) akzxVarP.p();
                    wyzVar2.b = j$.time.Instant.now().toEpochMilli();
                    ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) wzdVar.b.a()).x().a(wyzVar2);
                    return null;
                }
                java.lang.Object obj3 = this.b;
                long j2 = this.a;
                wzd wzdVar2 = (wzd) obj3;
                j$.util.Optional optionalI2 = wzdVar2.i(j2);
                boolean zIsPresent2 = optionalI2.isPresent();
                java.lang.Object obj4 = this.c;
                if (!zIsPresent2) {
                    defpackage.wyz wyzVar3 = new defpackage.wyz();
                    wyzVar3.a = j2;
                    wyzVar3.c = defpackage.wxp.a;
                    wyzVar3.d = (defpackage.xac) obj4;
                    wyzVar3.b = j$.time.Instant.now().toEpochMilli();
                    wzdVar2.k(wyzVar3);
                    return null;
                }
                ahvr.bY(j2 == ((defpackage.wyz) optionalI2.orElseThrow()).a);
                defpackage.xac xacVar = ((defpackage.wyz) optionalI2.orElseThrow()).d;
                defpackage.wyz wyzVar4 = (defpackage.wyz) optionalI2.orElseThrow();
                wyzVar4.b = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarP2 = xacVar.p();
                akzxVarP2.z((alad) obj4);
                wyzVar4.d = (defpackage.xac) akzxVarP2.p();
                if (wyzVar4.a() <= 2097152) {
                    ((com.android.incallui.atlas.ui.impl.database.AtlasDatabase) wzdVar2.b.a()).x().a(wyzVar4);
                    return null;
                }
                a.bI(wzd.a.c().m(aioa.b), "abort update as data size exceeds CursorWindow limit", "com/android/incallui/atlas/ui/impl/database/SafeAtlasDao", "update", (char) 501, "SafeAtlasDao.java", zct.b);
                aihd aihdVarB = wzd.b(xacVar);
                aihb aihbVar = new aihb();
                ailj ailjVarK = wzd.b((defpackage.xac) obj4).k();
                while (ailjVarK.hasNext()) {
                    defpackage.wzw wzwVar = (defpackage.wzw) ailjVarK.next();
                    if (!aihdVarB.contains(wzwVar)) {
                        aihbVar.i(wzwVar);
                    }
                }
                wzd.j(aihbVar.h());
                return null;
            }
            long j3 = this.a;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
            akzx akzxVarM = defpackage.amoc.a.m();
            defpackage.wxm wxmVar = (defpackage.wxm) this.b;
            j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(((defpackage.amoc) ((akzx) j$.util.Map.-EL.getOrDefault(wxmVar.c, lValueOf, akzxVarM)).p()).c);
            java.lang.Object obj5 = this.c;
            if (!stream.anyMatch(new vpl(obj5, 15))) {
                wxmVar.e(j3, new defpackage.who(obj5, 8));
                return null;
            }
        } else {
            long j4 = this.a;
            java.lang.Object obj6 = this.c;
            java.lang.Object obj7 = this.b;
            try {
                ((defpackage.vgs) obj7).b = ((defpackage.vgs) obj7).m("INBOX");
                defpackage.vtl vtlVarH = ((defpackage.vgs) obj7).b.h();
                ((defpackage.vgs) obj7).k((java.lang.String) obj6, j4);
                ((defpackage.vgs) obj7).h.a(zct.a).f(mgv.de, aike.a, defpackage.vgs.o(vtlVarH));
                vtlVar = vtlVarH;
            } catch (defpackage.vgv e) {
                aimw aimwVarK = defpackage.vgs.a.c().i(zct.b).k(e);
                ainp ainpVar = zct.a;
                aimwVarK.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/ImapOperations", "getQuota", 1170, "ImapOperations.java").v("getQuota failed");
                ((defpackage.vgs) obj7).h.a(ainpVar).f(mgv.de, aike.a, gus.aw("null"));
            } finally {
                ((defpackage.vgs) obj7).j();
            }
        }
        return vtlVar;
    }

    public /* synthetic */ vgq(defpackage.vgs vgsVar, java.lang.String str, long j, int i) {
        this.$cid = i;
        this.b = vgsVar;
        this.c = str;
        this.a = j;
    }

    public /* synthetic */ vgq(wzd wzdVar, long j, defpackage.wxp wxpVar, int i) {
        this.$cid = i;
        this.c = wzdVar;
        this.a = j;
        this.b = wxpVar;
    }
}
