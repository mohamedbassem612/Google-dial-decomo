package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oii {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public oii(com.android.dialer.expresso.sender.impl.ui.grid.ExpressoGridView expressoGridView) {
        this.a = expressoGridView;
        defpackage.oih oihVar = new defpackage.oih();
        this.b = oihVar;
        amcn amcnVar = new amcn();
        amcnVar.o(oihVar);
        amcnVar.n(new defpackage.mjl(new aoom() { // from class: oig
            public final java.lang.Object b(java.lang.Object obj) {
                throw null;
            }
        }, 5));
        amcnVar.a = ahaj.b();
        kh khVarM = amcnVar.m();
        this.c = khVarM;
        android.content.Context context = expressoGridView.getContext();
        aooh.e(context, "getContext(...)");
        android.view.View.inflate(context, 2131624216, expressoGridView);
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = expressoGridView.findViewById(2131428772);
        aooh.e(recyclerViewFindViewById, "findViewById(...)");
        android.support.v7.widget.RecyclerView recyclerView = recyclerViewFindViewById;
        recyclerView.Y(khVarM);
        recyclerView.Z((km) null);
    }

    public static ajcq p() {
        return aiql.y(new java.lang.IllegalStateException("Attempting to read/write into settings ProtoDataStore while in direct boot mode"));
    }

    public final int a() {
        int duration = ((android.media.MediaPlayer) this.a).getDuration();
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        return gus.aD(mgv.er, duration, (mgu) obj).f();
    }

    public final void b() {
        zjv.i((zjv) this.c, mgv.ee, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).pause();
    }

    public final void c() throws java.io.IOException {
        zjv.i((zjv) this.c, mgv.eh, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).prepare();
    }

    public final void d() {
        zjv.i((zjv) this.c, mgv.ei, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).prepareAsync();
    }

    public final void e() {
        zjv.i((zjv) this.c, mgv.ef, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).release();
    }

    public final void f() {
        zjv.i((zjv) this.c, mgv.eg, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).reset();
    }

    public final void g(int i) {
        zjv.i((zjv) this.c, mgv.eq, ajsz.aY(gus.au(i)), (mhc) null, 0, 28);
        ((android.media.MediaPlayer) this.a).seekTo(i);
    }

    public final void h(android.media.AudioAttributes audioAttributes) {
        aooh.f(audioAttributes, "attributes");
        zjv.i((zjv) this.c, mgv.eo, ajsz.bb(new mhc[]{gus.au(audioAttributes.getContentType()), gus.au(audioAttributes.getUsage()), gus.ax(fn$.ExternalSyntheticApiModelOutline0.m(audioAttributes))}), (mhc) null, 0, 28);
        ((android.media.MediaPlayer) this.a).setAudioAttributes(audioAttributes);
    }

    public final void i(java.lang.String str) throws java.io.IOException {
        aooh.f(str, "path");
        zjv.i((zjv) this.c, mgv.em, ajsz.bb(new mhc[]{gus.aw(str), gus.aw("null")}), (mhc) null, 0, 28);
        ((android.media.MediaPlayer) this.a).setDataSource(str);
    }

    public final void j(final aonj aonjVar) {
        java.lang.Object obj = this.a;
        if (aonjVar == null) {
            ((android.media.MediaPlayer) obj).setOnCompletionListener(null);
        } else {
            ((android.media.MediaPlayer) obj).setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: ojw
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
                    mgv mgvVar = mgv.ek;
                    defpackage.oii oiiVar = this.b;
                    zjv.i((zjv) oiiVar.c, mgvVar, (java.util.List) null, (mhc) null, 0, 30);
                    aonjVar.a(oiiVar);
                }
            });
        }
    }

    public final void k(final aono aonoVar) {
        java.lang.Object obj = this.a;
        if (aonoVar == null) {
            ((android.media.MediaPlayer) obj).setOnErrorListener(null);
        } else {
            ((android.media.MediaPlayer) obj).setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: ojv
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                    aono aonoVar2 = aonoVar;
                    defpackage.oii oiiVar = this;
                    boolean zBooleanValue = ((java.lang.Boolean) aonoVar2.a(oiiVar, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2))).booleanValue();
                    zjv.i((zjv) oiiVar.c, mgv.el, ajsz.bb(new mhc[]{gus.au(i), gus.au(i2)}), gus.ax(zBooleanValue), 0, 24);
                    return zBooleanValue;
                }
            });
        }
    }

    public final void l(final aonj aonjVar) {
        ((android.media.MediaPlayer) this.a).setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: ojx
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
                mgv mgvVar = mgv.ej;
                defpackage.oii oiiVar = this.b;
                zjv.i((zjv) oiiVar.c, mgvVar, (java.util.List) null, (mhc) null, 0, 30);
                aonjVar.a(oiiVar);
            }
        });
    }

    public final void m() {
        zjv.i((zjv) this.c, mgv.ec, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).start();
    }

    public final void n() {
        zjv.i((zjv) this.c, mgv.ed, (java.util.List) null, (mhc) null, 0, 30);
        ((android.media.MediaPlayer) this.a).stop();
    }

    public final boolean o() {
        java.lang.Object objF = new mgf((mgu) this.b, ((android.media.MediaPlayer) this.a).isPlaying()).a(mgv.eb).f();
        aooh.e(objF, "ifTrue(...)");
        return ((java.lang.Boolean) objF).booleanValue();
    }

    public final ajcq q() {
        return ((zzx) this.b).m() ? p() : ahvr.H(((aogc) this.c).bk(), new defpackage.onp(6), ajbm.a);
    }

    public oii(zjv zjvVar, mgu mguVar, android.media.MediaPlayer mediaPlayer) {
        aooh.f(zjvVar, "externalsLogging");
        aooh.f(mguVar, "scopedDiffRecorder");
        aooh.f(mediaPlayer, "mediaPlayer");
        this.c = zjvVar;
        this.b = mguVar;
        this.a = mediaPlayer;
    }

    public oii(aogc aogcVar, kaw kawVar, java.lang.Object obj) {
        this.c = aogcVar;
        this.a = kawVar;
        this.b = obj;
    }
}
