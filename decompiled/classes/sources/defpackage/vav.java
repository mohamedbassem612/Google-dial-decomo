package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vav {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl");
    public final android.content.Context b;
    public final defpackage.vtv c;
    public final defpackage.rwi d;
    public final defpackage.ajct e;
    public final defpackage.vao f;
    public final defpackage.rwq g;
    public final defpackage.rlv h;
    public final defpackage.ajct i;
    public final defpackage.ucr j;
    public final defpackage.zjl k;
    public final defpackage.vyu l;
    public final defpackage.zjs m;
    public final android.os.UserManager n;
    public final defpackage.vze o;
    public final defpackage.ops p;
    public final defpackage.uhs q;
    public final defpackage.gpd r;
    public final defpackage.aeqx s;
    public final defpackage.kgl t;
    public final defpackage.gpd u;
    public final defpackage.tvn v;
    public final defpackage.rsr w;
    public final defpackage.ipc x;
    private final defpackage.zzx y;

    public vav(android.content.Context context, defpackage.vtv vtvVar, defpackage.rwi rwiVar, defpackage.ajct ajctVar, defpackage.aeqx aeqxVar, defpackage.vze vzeVar, defpackage.vao vaoVar, defpackage.rwq rwqVar, defpackage.rlv rlvVar, defpackage.tvn tvnVar, defpackage.ops opsVar, defpackage.gpd gpdVar, defpackage.ajct ajctVar2, defpackage.kgl kglVar, defpackage.ucr ucrVar, defpackage.uhs uhsVar, defpackage.zjl zjlVar, defpackage.vyu vyuVar, defpackage.rsr rsrVar, defpackage.zjs zjsVar, defpackage.ipc ipcVar, defpackage.gpd gpdVar2, defpackage.zzx zzxVar, android.os.UserManager userManager) {
        this.b = context;
        this.c = vtvVar;
        this.d = rwiVar;
        this.e = ajctVar;
        this.s = aeqxVar;
        this.o = vzeVar;
        this.f = vaoVar;
        this.g = rwqVar;
        this.h = rlvVar;
        this.v = tvnVar;
        this.p = opsVar;
        this.r = gpdVar;
        this.i = ajctVar2;
        this.t = kglVar;
        this.j = ucrVar;
        this.q = uhsVar;
        this.k = zjlVar;
        this.l = vyuVar;
        this.w = rsrVar;
        this.m = zjsVar;
        this.x = ipcVar;
        this.u = gpdVar2;
        this.y = zzxVar;
        this.n = userManager;
    }

    public static j$.util.Optional f(uzo uzoVar) {
        defpackage.kiu kiuVar = uzoVar.d;
        if (kiuVar == null) {
            kiuVar = defpackage.kiu.a;
        }
        if ((kiuVar.b & 512) != 0) {
            defpackage.kiu kiuVar2 = uzoVar.d;
            if (kiuVar2 == null) {
                kiuVar2 = defpackage.kiu.a;
            }
            if ((kiuVar2.b & 1024) != 0) {
                defpackage.kiu kiuVar3 = uzoVar.d;
                if (kiuVar3 == null) {
                    kiuVar3 = defpackage.kiu.a;
                }
                android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(kiuVar3.m);
                defpackage.kiu kiuVar4 = uzoVar.d;
                if (kiuVar4 == null) {
                    kiuVar4 = defpackage.kiu.a;
                }
                return j$.util.Optional.of(new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, kiuVar4.n));
            }
        }
        return j$.util.Optional.empty();
    }

    public static j$.util.Optional g(uzo uzoVar) {
        uzn uznVar = uzoVar.c;
        if (uznVar == null) {
            uznVar = uzn.a;
        }
        if ((uznVar.b & 8) == 0) {
            return j$.util.Optional.empty();
        }
        uzn uznVar2 = uzoVar.c;
        if (uznVar2 == null) {
            uznVar2 = uzn.a;
        }
        return j$.util.Optional.of(uznVar2.f);
    }

    public static java.lang.String h(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return "VisualVoicemail_InboxFull_" + phoneAccountHandle.getComponentName().flattenToString() + phoneAccountHandle.getId();
    }

    public static java.lang.String i(java.lang.String str) {
        return "VisualVoicemail_".concat(java.lang.String.valueOf(str));
    }

    public final android.app.PendingIntent a(android.content.Context context) {
        android.content.Intent intentBc = this.x.bc(4);
        intentBc.putExtra("EXTRA_MARK_ALL_NEW_VOICEMAILS_AS_OLD", true);
        return afap.b(context, 0, intentBc, 201326592);
    }

    public final defpackage.ajcq b(java.util.List list) {
        return defpackage.ahvr.I(d(), new defpackage.uhj(this, list, 17), this.e);
    }

    public final defpackage.ajcq c(j$.util.Optional optional) {
        return defpackage.ahvr.H(this.f.a(optional), new van(this, 2), this.e);
    }

    public final defpackage.ajcq d() {
        defpackage.ajcq ajcqVarF = this.d.f();
        defpackage.kvf kvfVar = new defpackage.kvf(8);
        long j = defpackage.ahqx.a;
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVarF, new defpackage.ahqv(defpackage.ahns.c(false), kvfVar));
        ajcqVarF.c(ajamVar, defpackage.aiql.t(this.e, ajamVar));
        return ajamVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final defpackage.ajcq e() {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "updateNotification", 186, "VoicemailNotifierImpl.java")).v("enter");
        if (this.y.m()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/voicemail/notification/impl/VoicemailNotifierImpl", "updateNotification", 188, "VoicemailNotifierImpl.java")).v("cannot update voicemail notification during direct boot");
            return defpackage.ajcm.a;
        }
        defpackage.vcz vczVar = new defpackage.vcz(this, 1);
        defpackage.ajct ajctVar = this.i;
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), vczVar, 1));
        ajctVar.execute(ajdkVar);
        defpackage.jwf jwfVar = new defpackage.jwf(this, 20);
        defpackage.ajct ajctVar2 = this.e;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), jwfVar, 1);
        int i = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ajdkVar, ajaxVar);
        ajdkVar.c(ajalVar, defpackage.aiql.t(ajctVar2, ajalVar));
        return ajalVar;
    }
}
