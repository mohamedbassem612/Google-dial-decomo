package com.google.android.wizardmanager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class WizardAction implements android.os.Parcelable, defpackage.xpa {
    static final java.lang.String BRANCHES_KEY = "branches";
    static final java.lang.String CONFIG_KEY = "config";
    public static final android.os.Parcelable.Creator CREATOR;
    static final java.lang.String DEPENDENCY_TREE_KEY = "dependency_tree";
    private static final java.lang.String EXTRA_LOAD_SCRIPT_URI = "loadScriptUri";
    static final java.lang.String FLOW_KEY = "flow";
    static final java.lang.String ID_KEY = "id";
    static final java.lang.String IF_FLOW_KEY = "if_flow";
    static final java.lang.String IF_LIFECYCLE_KEY = "if_lifecycle";
    static final java.lang.String INDEX_KEY = "index";
    static final java.lang.String NODE_KEY = "node";
    static final java.lang.String PRIMARY_KEY = "primary";
    static final java.lang.String SCRIPT_URI_KEY = "script_uri";
    static final java.lang.String UI_DEPENDENCY_TREE_KEY = "ui_dependency_tree";
    static final java.lang.String URI_KEY = "uri";
    public static final com.google.android.wizardmanager.WizardAction YIELD_ACTION;
    public static final java.lang.String YIELD_ACTION_ID = "#YIELD";
    private final com.google.android.wizardmanager.WizardBranchArray branches;
    private final com.android.onboarding.config.OnboardingConfig config;
    private final com.google.android.wizardmanager.WizardActionDependency dependencyTree;
    private final java.lang.String flow;
    private final java.lang.String id;
    private final java.lang.String ifFlow;
    private final java.lang.String ifLifecycle;
    private final int index;
    private final java.lang.String logId;
    private final java.lang.String node;
    private final boolean primary;
    private final java.lang.String scriptUri;
    private final com.google.android.wizardmanager.WizardActionDependency uiDependencyTree;
    private final java.lang.String uri;

    static {
        defpackage.agmb agmbVar = new defpackage.agmb(YIELD_ACTION_ID, 0);
        agmbVar.c = YIELD_ACTION_ID;
        agmbVar.d = null;
        YIELD_ACTION = new com.google.android.wizardmanager.WizardAction(agmbVar);
        CREATOR = new defpackage.acay(18);
    }

    public WizardAction(defpackage.agmb agmbVar) {
        java.lang.String str = agmbVar.a;
        this.scriptUri = str;
        this.index = agmbVar.b;
        java.lang.String str2 = agmbVar.c;
        this.id = str2;
        this.uri = agmbVar.d;
        this.node = agmbVar.e;
        this.ifLifecycle = agmbVar.f;
        this.flow = agmbVar.g;
        this.ifFlow = agmbVar.h;
        this.branches = agmbVar.i;
        this.dependencyTree = agmbVar.j;
        this.uiDependencyTree = agmbVar.k;
        this.logId = java.lang.String.format("%s#%s", str, str2);
        this.config = agmbVar.l;
        this.primary = agmbVar.m;
    }

    public static void dump(java.lang.String str, com.google.android.wizardmanager.WizardAction wizardAction) {
        if (str == null) {
            str = "";
        }
        if (wizardAction == null) {
            defpackage.agmc.p(str.concat("DUMP WizardAction instance is null"));
            return;
        }
        defpackage.agmc.p(str + "scriptUri=" + wizardAction.scriptUri);
        defpackage.agmc.p(str + "index=" + wizardAction.index);
        defpackage.agmc.p(str + "id=" + wizardAction.id);
        defpackage.agmc.p(str + "uri=" + wizardAction.uri);
        defpackage.agmc.p(str + "node=" + wizardAction.node);
        defpackage.agmc.p(str + "ifLifecycle=" + wizardAction.ifLifecycle);
        defpackage.agmc.p(str + "flow=" + wizardAction.flow);
        defpackage.agmc.p(str + "ifFlow=" + wizardAction.ifFlow);
        defpackage.agmc.p(str + "branches=" + java.lang.String.valueOf(wizardAction.branches));
        defpackage.agmc.p(str + "config=" + java.lang.String.valueOf(wizardAction.config));
        defpackage.agmc.p(str + "primary=" + wizardAction.primary);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.wizardmanager.WizardAction)) {
            return false;
        }
        com.google.android.wizardmanager.WizardAction wizardAction = (com.google.android.wizardmanager.WizardAction) obj;
        return this.index == wizardAction.index && j$.util.Objects.equals(this.id, wizardAction.id) && j$.util.Objects.equals(this.uri, wizardAction.uri) && j$.util.Objects.equals(this.node, wizardAction.node) && j$.util.Objects.equals(this.branches, wizardAction.branches) && j$.util.Objects.equals(this.scriptUri, wizardAction.scriptUri) && j$.util.Objects.equals(this.ifLifecycle, wizardAction.ifLifecycle) && j$.util.Objects.equals(this.flow, wizardAction.flow) && j$.util.Objects.equals(this.ifFlow, wizardAction.ifFlow) && j$.util.Objects.equals(this.dependencyTree, wizardAction.dependencyTree) && j$.util.Objects.equals(this.uiDependencyTree, wizardAction.uiDependencyTree) && j$.util.Objects.equals(this.config, wizardAction.config) && this.primary == wizardAction.primary;
    }

    public com.google.android.wizardmanager.WizardBranchArray getBranches() {
        return this.branches;
    }

    public com.android.onboarding.config.OnboardingConfig getConfig() {
        return this.config;
    }

    public java.lang.String getCustomizedFlow() {
        return this.flow;
    }

    public com.google.android.wizardmanager.WizardActionDependency getDependencyTree() {
        return this.dependencyTree;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public java.lang.String getIfFlow() {
        return this.ifFlow;
    }

    public java.lang.String getIfLifecycle() {
        return this.ifLifecycle;
    }

    public int getIndex() {
        return this.index;
    }

    public android.content.Intent getIntent() {
        java.lang.String str = this.uri;
        if (str == null) {
            return null;
        }
        try {
            return android.content.Intent.parseUri(str, 1);
        } catch (java.net.URISyntaxException unused) {
            android.util.Log.e("WizardManager", defpackage.agmc.q("getIntent() FAIL due to bad URI: ".concat(java.lang.String.valueOf(this.uri))));
            return null;
        }
    }

    public java.lang.String getLoadScriptUri() {
        if (android.text.TextUtils.isEmpty(this.uri) || !this.uri.startsWith("intent:")) {
            return null;
        }
        try {
            return android.content.Intent.parseUri(this.uri, 0).getStringExtra(EXTRA_LOAD_SCRIPT_URI);
        } catch (java.net.URISyntaxException e) {
            android.util.Log.w("WizardManager", defpackage.agmc.q("Failed to get loadScriptUri from uri"), e);
            return null;
        }
    }

    public java.lang.String getLogId() {
        return this.logId;
    }

    public java.lang.String getNextActionId(int i) {
        return this.branches.getActionId(i);
    }

    java.util.List getNextActionIds(int i) {
        return this.branches.getActionIds(i);
    }

    public java.lang.String getNode() {
        return this.node;
    }

    public java.lang.String getScriptUri() {
        return this.scriptUri;
    }

    public com.google.android.wizardmanager.WizardActionDependency getUiDependencyTree() {
        return this.uiDependencyTree;
    }

    public java.lang.String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.scriptUri, java.lang.Integer.valueOf(this.index), this.id, this.uri, this.node, this.ifLifecycle, this.flow, this.ifFlow, this.branches, this.dependencyTree, this.uiDependencyTree, this.config, java.lang.Boolean.valueOf(this.primary)});
    }

    public java.lang.String indentedToString() {
        return "{\n   scriptUri = " + this.scriptUri + "\n   index = " + this.index + "\n   id = " + this.id + "\n   uri = " + this.uri + "\n   node = " + this.node + "\n   ifLifecycle = " + this.ifLifecycle + "\n   flow = " + this.flow + "\n   ifFlow = " + this.ifFlow + "\n   branches = " + this.branches + "\n   dependencyTree = " + this.dependencyTree + "\n   uiDependencyTree = " + this.uiDependencyTree + "\n   config = " + this.config + "\n   primary = " + this.primary + "\n  }";
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public defpackage.agmb toBuilder() {
        defpackage.agmb agmbVar = new defpackage.agmb(this.scriptUri, this.index);
        agmbVar.c = this.id;
        agmbVar.d = this.uri;
        agmbVar.e = this.node;
        agmbVar.f = this.ifLifecycle;
        agmbVar.g = this.flow;
        agmbVar.h = this.ifFlow;
        agmbVar.i = this.branches;
        agmbVar.a(this.dependencyTree);
        agmbVar.b(this.uiDependencyTree);
        agmbVar.l = this.config;
        agmbVar.m = this.primary;
        return agmbVar;
    }

    @Override // defpackage.xpa
    public android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString(SCRIPT_URI_KEY, this.scriptUri);
        persistableBundle.putInt(INDEX_KEY, this.index);
        persistableBundle.putString(ID_KEY, this.id);
        persistableBundle.putString(URI_KEY, this.uri);
        persistableBundle.putString("node", this.node);
        persistableBundle.putString(IF_LIFECYCLE_KEY, this.ifLifecycle);
        persistableBundle.putString(FLOW_KEY, this.flow);
        persistableBundle.putString(IF_FLOW_KEY, this.ifFlow);
        defpackage.xfh.i(persistableBundle, BRANCHES_KEY, this.branches);
        defpackage.xfh.i(persistableBundle, DEPENDENCY_TREE_KEY, this.dependencyTree);
        defpackage.xfh.i(persistableBundle, UI_DEPENDENCY_TREE_KEY, this.uiDependencyTree);
        defpackage.xfh.i(persistableBundle, CONFIG_KEY, this.config);
        persistableBundle.putBoolean(PRIMARY_KEY, this.primary);
        return persistableBundle;
    }

    public java.lang.String toString() {
        com.android.onboarding.config.OnboardingConfig onboardingConfig = this.config;
        com.google.android.wizardmanager.WizardActionDependency wizardActionDependency = this.uiDependencyTree;
        com.google.android.wizardmanager.WizardActionDependency wizardActionDependency2 = this.dependencyTree;
        return "WizardAction{id=" + this.id + " uri=" + this.uri + " node=" + this.node + " scriptUri=" + this.scriptUri + " ifLifecycle=" + this.ifLifecycle + " flow=" + this.flow + " ifFlow=" + this.ifFlow + " index=" + this.index + " branches=" + java.lang.String.valueOf(this.branches) + " dependencyTree=" + java.lang.String.valueOf(wizardActionDependency2) + " uiDependencyTree=" + java.lang.String.valueOf(wizardActionDependency) + " config=" + java.lang.String.valueOf(onboardingConfig) + " primary=" + this.primary + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.scriptUri);
        parcel.writeInt(this.index);
        parcel.writeString(this.id);
        parcel.writeString(this.uri);
        parcel.writeString(this.node);
        parcel.writeString(this.ifLifecycle);
        parcel.writeString(this.flow);
        parcel.writeString(this.ifFlow);
        parcel.writeParcelable(this.branches, i);
        parcel.writeParcelable(this.dependencyTree, i);
        parcel.writeParcelable(this.uiDependencyTree, i);
        parcel.writeParcelable(this.config, i);
        parcel.writeInt(this.primary ? 1 : 0);
    }
}
